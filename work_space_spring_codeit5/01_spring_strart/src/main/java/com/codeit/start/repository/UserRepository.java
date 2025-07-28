package com.codeit.start.repository;

import com.codeit.start.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

// 리포지토리임을 알리는 어노테이션, + Bean 생성
@Repository
public class UserRepository {
    private final List<User> list = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong();

    public UserRepository() {
        list.add(new User(counter.incrementAndGet(),"test1", "1234", "홍길동"));
        list.add(new User(counter.incrementAndGet(),"test2", "1234", "박길동"));
        list.add(new User(counter.incrementAndGet(),"test3", "1234", "최길동"));
    }

    public User save(User user){
        if (user.getId() == null) {
            user.setId(counter.incrementAndGet());
        } else {
            list.removeIf(u -> u.getId().equals(user.getId()));
        }
        list.add(user);
        return user;
    }

    public Optional<User> findById(Long id){
        return list.stream().filter(x -> x.getId().equals(id)).findFirst();
    }

    public List<User> findAll(){
       return list;
    }

    public long count(){
        return list.size();
    }

    public void deleteById(Long id){
        list.removeIf(x -> x.getId().equals(id));
    }

    public boolean existsById(Long id){
        return list.stream().anyMatch(x -> x.getId().equals(id));
    }
}
