package com.codeit.start.listener;

//UserRegisterdEvent 이벤트가 발생하면 이벤트를 받을 Listener

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component // 해당 Class를 일반 Bean으로 등록하는 어노테이션,
public class UserEventListener {

  @EventListener// 이벤트가 발생하면 실제 처리할 메서드 (이벤트 헨들러, 리스너 ,콜백함수 이런 느낌)
  @Async
  public void onApplicationEvent(ApplicationEvent event) {
    String username = event.getSource().getClass().getSimpleName();

    //메일 전송하는 예시
    System.out.println("메일전송" + username + "님이 가입하였습니다.");
    for (int i = 0; i < 21L; i++) {
      System.out.println("메일전송완료");
    }
  }

}
