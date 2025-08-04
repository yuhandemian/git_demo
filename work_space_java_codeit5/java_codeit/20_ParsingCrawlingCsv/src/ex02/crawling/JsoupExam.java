package ex02.crawling;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

// https://offbyone.tistory.com/116
public class JsoupExam {
    public static void main(String[] args) throws Exception {
        // 다음 뉴스 페이지 크롤링
        String URL = "https://news.daum.net/tech/";


        Connection conn = Jsoup.connect(URL);
        Document doc = conn.get(); // 정해진 url로 부터 Document(html 문서)를 가져오는 방법

        //	Elements : 태그 배열로 구성된 객체
        //	Element : 태그 하나만 의미

        // 1. doc.getElementsByTag() : 태그 기준으로 크롤링 메서드
        //    getElementsByClass : class의 이름으로 크롤링
        Elements elements = doc.getElementsByTag("a"); // a 태그 모두 가져오기!
        for(Element element : elements){
            Elements newsheadline = element.getElementsByClass("item_newsheadline2");
            if(!newsheadline.isEmpty()){
                System.out.println("text : " + newsheadline.text());
                System.out.println("href : " + newsheadline.attr("href"));
            }
        }
        System.out.println("----------------------------------------------------------");
        
        // 2. class +  부모 자식 접근해보기
        // getElementsByClass
        Element newsHeadLine1 = doc.getElementsByClass("list_newsheadline2").first();
        Element newsHeadLineList = newsHeadLine1.firstElementChild();
        System.out.println(newsHeadLine1);
        System.out.println("------------------------");
        System.out.println(newsHeadLineList);
        System.out.println("------------------------------ @@@@");

        Elements newsList = doc.getElementsByClass("item_newsheadline2");
        for (Element element : newsList) {
            System.out.println(element);
            Element title = element.getElementsByClass("tit_txt").first(); // 타이틀
            Element desc = null;
            if(!element.getElementsByClass("desc_txt").isEmpty()){
                desc = element.getElementsByClass("desc_txt").first(); // 설명
            }
            Element press = element.getElementsByClass("txt_info").first(); // 언론사

            System.out.println("제목 : " + title.text());
            System.out.println("설명 : " + (desc != null ? desc.toString() : null));
            System.out.println("제공사 : " + press.text());
            System.out.println("링크 : " + element.attr("href"));
            System.out.println();
        }


        // -----------------------------
        // 3. CSS Query로 접근 (class + 태그)
        // -----------------------------
        Elements cssNewsList = doc.select(".list_newsheadline2 a.item_newsheadline2");
        for (Element element : cssNewsList) {
            Element titleElement = element.selectFirst(".tit_txt");
            Element pressElement = element.selectFirst(".txt_info");
            System.out.println("제목 : " + titleElement.text());
            System.out.println("링크 : " + element.attr("href"));
            System.out.println("작성자 : " + (pressElement != null ? pressElement.text() : ""));
            System.out.println();
        }


        System.out.println("---------------------------------------------------");
        System.out.println("벅스 100");
        URL = "https://music.bugs.co.kr/chart";
        conn = Jsoup.connect(URL);
        doc = conn.get();
        Elements titles = doc.select(".title > a");
        Elements artists = doc.select(".artist > a");
        for(int i = 0; i < titles.size(); i++) {
            System.out.print(i+1+"위 : ");
            System.out.print(titles.get(i).text().strip() +" - ");
            System.out.print(artists.get(i).text().strip());
            System.out.println();
        }

    }
}
