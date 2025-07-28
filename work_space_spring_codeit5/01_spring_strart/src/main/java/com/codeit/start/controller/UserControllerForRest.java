package com.codeit.start.controller;

import com.codeit.start.domain.User;
import com.codeit.start.service.UserService;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//rest 컨트롤러

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor

public class UserControllerForRest {

  private final UserService userService;

  //회원 전체 목록 조회
  // ResponseEntity : 응답 값을 만들고 Json으로 변환시켜주는 객체
  @GetMapping("/")
  public ResponseEntity<List<User>> getAllUser() {
    //return ResponseEntity.ok(userService.getAllUsers());
    return ResponseEntity.status(200).body(userService.getAllUsers());
  }

  //회원 단건 조회
  @GetMapping("/{id}")
  public ResponseEntity<List<User>> getByUserId(@PathVariable Long id) {
    //return ResponseEntity.ok(userService.getAllUsers());
    Optional<User> user = userService.getUserById(id);
    user.orElseThrow(NoSuchElementException::new);
    return ResponseEntity.ok(Collections.singletonList(user.get()));
  }

  //회원 등록
  @PostMapping
  public ResponseEntity<User> createUser(@RequestBody User user) {// @RequestBody : json body 파싱할때
    User savedUser = userService.register(user);
    return ResponseEntity.status(201).body(savedUser);
  }

  //회원 등록
  @PostMapping("/create")
  public ResponseEntity<User> createFormUser(
      @ModelAttribute User user) {// @ModelAttribute : json body 파싱할때
    User savedUser = userService.register(user);
    return ResponseEntity.status(201).body(savedUser);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<User> deleteUser(@PathVariable Long id) {
    Optional<User> user = userService.getUserById(id);
    user.orElseThrow(NoSuchElementException::new);  // 없으면 404 예외 발생

    userService.deleteUser(id);  // 실제 삭제

    return ResponseEntity.ok(user.get());  // 삭제된 유저 정보 반환
  }

  // 모든 예외 처리
  @ExceptionHandler(Exception.class)
  public ResponseEntity<String> handleException(Exception ex) {
    return ResponseEntity.internalServerError().body("서버 오류가 발생했습니다");
  }


}


