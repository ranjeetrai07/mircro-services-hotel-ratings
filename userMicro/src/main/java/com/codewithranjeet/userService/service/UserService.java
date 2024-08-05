package com.codewithranjeet.userService.service;

import com.codewithranjeet.userService.entities.User;
import com.codewithranjeet.userService.exceptions.ResourceNotFoundException;
import com.codewithranjeet.userService.repository.UserRepository;
import com.codewithranjeet.userService.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService implements UserServiceImpl {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        String randomUserId = UUID.randomUUID().toString();
        user.setUserId(randomUserId);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUser(String userId) {
        return Optional.ofNullable(userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User with given id is not fond on server !!" + userId)));
    }

}
