package com.example.shop62.UserRepository;

import com.example.shop62.model.User;

import java.util.List;

public interface UserRepository {
    List<User> getAll();
    User save(User user);
    User update(User user);
    User getById(Long id);
    User getByEmail(String email);
}
