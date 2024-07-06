package com.codewithranjeet.userService.service.impl;

import com.codewithranjeet.userService.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserServiceImpl {

    //create
    User saveUser(User user);

    //get all user
    List<User> getAllUser();

    //get single user of given userId
    Optional<User> getUser(String userId);



}
