package com.example.shop62.UserRepository;

import com.example.shop62.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepositoryMap  implements UserRepository{

    private Map<Long, User> memoryStorage = new HashMap<>();
    private Long currentId;



    public UserRepositoryMap() {
        initStorage();
    }

    private  void  initStorage(){
     save(new User());
    }

    @Override
    public List<User> getAll() {
        return memoryStorage.values().stream().toList();
    }

    @Override
    public User save(User user) {
        user.setId(++currentId);
        memoryStorage.put(user.getId(), user);
        return user;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public User getByEmail(String email) {
        return null;
    }
}
