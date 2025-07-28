package com.codeit.start.event;

import com.codeit.start.domain.User;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

// 사용자 등록된 경우 발생하는 이벤트
// ApplicationEvent : 이벤트를 생성할 때 발생하는 이벤트

@Getter
public class UserRegisteredEvent  extends ApplicationEvent {
private User user;


  public UserRegisteredEvent(Object source, User saveUser) {
    super(source);
    this.user = user;
  }
}
