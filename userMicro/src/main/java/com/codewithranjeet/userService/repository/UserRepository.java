package com.codewithranjeet.userService.repository;

import com.codewithranjeet.userService.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {


}
