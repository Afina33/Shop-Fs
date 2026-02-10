package com.example.shop62.service;

import com.example.shop62.model.User;
import com.example.shop62.UserRepository.UserRepository;
import com.example.shop62.UserRepository.UserRepositoryMap;

public class UserServiceWithoutSpring {
    // Жесткая связь с конкретной реализацией
    private UserRepository userRepositoryMemory = new UserRepositoryMap();

    public User findUser(Long id) {
        return userRepositoryMemory.getById(id);
    }
}
