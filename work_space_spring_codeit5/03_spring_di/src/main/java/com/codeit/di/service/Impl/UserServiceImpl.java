package com.codeit.di.service.Impl;


import com.codeit.di.domain.User;
import com.codeit.di.repository.UserRepository;
import com.codeit.di.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("userService")
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    // 최근 생각하는 최선의 방법 = 이름으로 맞춘다.
//    private final UserRepository userRepositoryImpl;

    private static User loginUser;
    // 별칭을 선언하면 자동으로 맞춰준다.
    private final UserRepository userRepository;

    @Override
    public User login(User user) {
        User foundUser = userRepository.findByUsername(user.getUsername())
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 사용자 입니다."));

        if (!foundUser.getPassword().equals(user.getPassword())) {
            throw new IllegalArgumentException("비밀번호가 일치하지 않습니다.");
        }
        loginUser = foundUser;
        return foundUser;
    }

    @Override
    public void logout() {
        loginUser = null;
    }

    @Override
    public Optional<User> getLoginUser() {
        return Optional.ofNullable(loginUser);
    }

    @Override
    public User register(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.delete(id);
    }
}
