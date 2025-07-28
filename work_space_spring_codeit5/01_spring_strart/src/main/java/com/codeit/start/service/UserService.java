package com.codeit.start.service;

import com.codeit.start.Application;
import com.codeit.start.domain.User;
import com.codeit.start.event.UserRegisteredEvent;
import com.codeit.start.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// Service임을 알리는 어노테이션 + Bean 생성
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

@Autowired
    private ApplicationEventPublisher eventPublisher;



  public User register(User user){
        User saveUser = userRepository.save(user);
        //회원 가입 이벤트 발생 시점!
        eventPublisher.publishEvent(new UserRegisteredEvent(this, saveUser));
        // 비동기
        return saveUser;
    }

    public Optional<User> getUserById(Long id){
        return userRepository.findById(id);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}