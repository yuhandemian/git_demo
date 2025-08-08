package com.codeit.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("localhost : http://localhost:8080");
    }
    // 5. header, cookie, Session 정보 받아 오기
    // Writer : 사용자가 직접 본문을 작성할때 사용할수 있다. -> response에 있었던 객체
    // @RequestHeader : header값 가져오는 어노테이션
    // @CookieValue : 쿠기 정보를 가져올때 사용하는 어노테이션, required = false 일때 null 허용된다.
    // @SessionAttribute : 세션 정보를 가져올때 사용하는 어노테이션, required = false 일때 null 허용된다.
    // Locale : 사용자 요청 언어
    // void 인경우는 return 없을때 활용 -> view가 존재하지 않는다!
    // 참고로 REST는 더 좋게 만드는 방법이 있음으로 Writer 쓰지 말것.

}
