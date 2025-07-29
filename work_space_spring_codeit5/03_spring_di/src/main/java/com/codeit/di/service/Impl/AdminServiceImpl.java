package com.codeit.di.service.Impl;


import com.codeit.di.domain.User;
import com.codeit.di.repository.UserRepository;
import com.codeit.di.service.UserService;
import java.util.Optional;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service("adminService")
@RequiredArgsConstructor
public class AdminServiceImpl implements UserService {

    // 최근 생각하는 최선의 방법 = 이름으로 맞춘다.
//    private final UserRepository userRepositoryImpl;

    private static User loginUser;
    // 별칭을 선언하면 자동으로 맞춰준다.
    private final UserRepository userRepository;
    private final UserRepository adminRepository;

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
    public User register(User user){
        throw new UnsupportedOperationException("관리자는 회원가입이 불가능합니다. ");
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return Optional.empty();
    }

    public Optional<User> getUserById(Long id, Optional<User> foundUser) {
        Optional<User> user = userRepository.findById(id);
        if (!foundUser.isEmpty()) {
            return adminRepository.findById(id);
        }

        return foundUser;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users = userRepository.findAll();
        List<User> adminUsers = adminRepository.findAll();
        users.addAll(adminUsers);
        return userRepository.findAll();

    }

    @Override
    public void deleteUser(Long id) {
        userRepository.delete(id);
    }
}
