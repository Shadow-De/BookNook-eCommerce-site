package com.example.thebooknook.service;

import org.springframework.stereotype.Service;

import com.example.thebooknook.model.User;
import com.example.thebooknook.repo.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
