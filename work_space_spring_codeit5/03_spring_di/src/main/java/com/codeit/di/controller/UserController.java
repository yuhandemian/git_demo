package com.codeit.di.controller;

import com.codeit.di.service.Impl.UserServiceImpl;
import com.codeit.di.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
private final UserService userService;
private final UserServiceImpl adminService;

//로그인 페이지

}
