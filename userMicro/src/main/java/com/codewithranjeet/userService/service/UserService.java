package com.codewithranjeet.userService.service;

import com.codewithranjeet.userService.entities.User;
import com.codewithranjeet.userService.repository.UserRepository;
import com.codewithranjeet.userService.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UserService implements UserServiceImpl {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUser(String userId) {
        return userRepository.findById(userId);
    }
}
