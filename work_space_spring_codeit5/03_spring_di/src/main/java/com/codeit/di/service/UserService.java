package com.codeit.di.service;

import com.codeit.di.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User login(User user);
    void logout();
    Optional<User> getLoginUser();
    User register(User user);
    Optional<User> getUserById(Long id);
    List<User> getAllUsers();
    void deleteUser(Long id);
}