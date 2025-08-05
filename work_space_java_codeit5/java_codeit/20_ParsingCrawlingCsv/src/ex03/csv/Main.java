package ex03.csv;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<LineInfo> menuList = CSVParser.makeCSVList("20_ParsingCrawlingCsv/전라남도_메뉴정보_20210120.csv", "UTF-8");
        System.out.println("메뉴 정보 출력하기");
        menuList.forEach(System.out::println);
        System.out.println(menuList.get(0).getData("메뉴명"));
        System.out.println(menuList.get(0).getData("메뉴가격"));
        System.out.println("----------------------------------------");

        //1)식당과 모든 메뉴를 탐색할 수 있는 기능
        //1.1) 무지성 접근 ->좋지 않다. 성능 최악 !
//        for (LineInfo rInfo : restaurantList) {
//            String rId = rInfo.getData("식당ID");
//            System.out.println(rInfo);
//            for (LineInfo mInfo : menuList) {
//                if(mInfo.getData())
//            }
//        }
        //1.2} 자료구조사용 (map을 통한 시간 단축)

        // 식당ID - 식당 Line 정보
        Map<String, LineInfo> restaurantIDToLineInfoMap = new HashMap<>();

        // 식당ID - 메뉴 리스트
        Map<String, List<LineInfo>> restaurantIDToMenuListMap = new HashMap<>();
        
        //초기화 코드
        for (LineInfo lineInfo : menuList) {
            String rId = lineInfo.getData("식당ID");
            List<LineInfo> list = restaurantIDToMenuListMap.get(rId);
            if (list == null) {
                list = new ArrayList<>();
                restaurantIDToMenuListMap.put(rId, list);
            }
            list.add(lineInfo);
        }
        // 출력부
        for (LineInfo lineInfo : menuList) {
            String rid = lineInfo.getData("식당ID");
            System.out.println(lineInfo);
            List<LineInfo> list = restaurantIDToMenuListMap.get(rid);
            for (LineInfo lineInfo2 : list) {
                System.out.println("\t" + lineInfo2);
                
            }
        }
        System.out.println("----------------------------");

        //2. 특정 키워드로 식당을 찾으면 메뉴까지 보여주는 기능
        String keyword = "갈비";
        for (LineInfo lineInfo : menuList) {
            if (lineInfo.getData("식당명").contains(keyword)) {
                System.out.println(lineInfo);
            }
        }
    }
    }

