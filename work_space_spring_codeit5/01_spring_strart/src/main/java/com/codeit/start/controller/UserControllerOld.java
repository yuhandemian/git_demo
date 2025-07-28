//package com.codeit.start.controller;
//
//import com.codeit.start.domain.User;
//import com.codeit.start.service.UserService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.util.Optional;
//
//// @Controller 임을 알리는 어노테이션 = Bean이 될 대상
//@Controller
//@RequestMapping("/users") //  RequestMapping Controller에서 반복적으로 사용할 상위 url을 단축하는 방법
//@RequiredArgsConstructor // lombok에서 필요한 생성자 만드는 방법
//public class UserControllerOld {
//
//    private final UserService userService;
//
//    // 회원가입 페이지
//    @GetMapping("/signup") // /users/signup
//    public String signupForm() {
//        return "users/signup-form";
//    }
//
//    // 회원가입 처리
//    @PostMapping("/signup")
//    public String signup(Model model, User user) {
//        User registeredUser = userService.register(user);
//        model.addAttribute("user", registeredUser);
//        return "users/signup-success";
//    }
//
//    //회원 전체 목록 페이지
//    @GetMapping({"/", "/list"})
//    public String list(Model model) {
//        model.addAttribute("users", userService.getAllUsers());
//        return "users/list";
//    }
//
//    // 회원 상세 조회
//    @GetMapping("/{id}")
//    public String detail(@PathVariable Long id, Model model) {
//        Optional<User> user = userService.getUserById(id);
//        if (user.isPresent()) {
//            model.addAttribute("user", user.get());
//            return "users/detail";
//        } else {
//            return "redirect:/users/list";
//        }
//    }
//
//    // 회원 탈퇴
//    @PostMapping("/{id}/delete")
//    public String delete(@PathVariable Long id) {
//        userService.deleteUser(id);
//        return "redirect:/users/list";
//    }
//    // 모든 예외 처리
//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<String> handleException(Exception ex) {
//        return ResponseEntity.internalServerError().body("서버 오류가 발생했습니다");
//    }
//}
