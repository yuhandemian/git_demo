package ex01.parsing;


// https://www.kobis.or.kr/kobisopenapi/homepg/apiservice/searchServiceInfo.do

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import ex01.parsing.dto.BoxOffice;
import ex01.parsing.dto.BoxOfficeResult;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

// Jackson 활용 예제
// spring-web에 내장된 라이브러리로 Spring에서는 자유롭게 사용가능
// 자매품 = gson, 사용법이 거의 유사함
// Jackson 방식은 json을 POJO로 바로 변환함 -> DTO류 필요!
public class OpenAPIManagerForJsonJackson {
    public static final String KEY = "be34f20d99e875855b6997ecb0c02f27";
    public static final String WEEKLY_BOXOFFICE_JSON_URL = "http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchWeeklyBoxOfficeList.json";


    public static void main(String[] args) {
        List<BoxOffice> list = parse("20250801");
        for(BoxOffice b : list) {
            System.out.println(b.toString());
        }
    }

    public static List<BoxOffice> parse(String dateStr) {
        // URL 조합하는 단계
        StringBuilder urlBuilder = new StringBuilder(WEEKLY_BOXOFFICE_JSON_URL);
        urlBuilder.append("?key=").append(KEY);
        urlBuilder.append("&targetDt=").append(dateStr);
        System.out.println("url:" + urlBuilder.toString());

        // URL을 통해 HttpURLConnection 객체를 생성하고 실제 서버로 요청하는 단계
        try {
            URL url = new URL(urlBuilder.toString());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-type", "application/json");
            int code = conn.getResponseCode();
            System.out.println("Response code: " + code);
            // 요청이 실패했을때는 넘어감
            if (code != 200) {
                System.out.println("요청에 실패하였습니다!");
                return new ArrayList<>();
            }
            // 성공 케이스
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = rd.readLine()) != null) {
                sb.append(line);
            }
            rd.close();
            conn.disconnect();
//            System.out.println(sb.toString()); // 문자열
            List<BoxOffice> list = new ArrayList<>();

            // Jackson을 통한 파싱
            ObjectMapper mapper = new ObjectMapper(); // 파싱을 해주는 핵심 객체 선언
            JsonNode root = mapper.readTree(sb.toString()); // 실제 파싱하는 단계
            JsonNode boxOfficeResult = root.get("boxOfficeResult");
            BoxOfficeResult  result = mapper.readValue(boxOfficeResult.toString(), BoxOfficeResult.class);
//            System.out.println(result.toString());

            // 순수 list만 가져오기
            JsonNode weeklyBoxOfficeList = root.path("boxOfficeResult").path("weeklyBoxOfficeList");
            list = mapper.readerForListOf(BoxOffice.class).readValue(weeklyBoxOfficeList);
//            System.out.println(list);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

}
