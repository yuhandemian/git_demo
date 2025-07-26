package com.codeit.start.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // ← 수정: 뷰 반환이므로 RestController가 아니라 Controller
public class UserController {

  // 회원가입 페이지
  @GetMapping("/signup")
  public String signupForm() {
    return "user/signup-form"; // templates/user/signup-form.html 또는 .jsp로 연결됨
  }
}