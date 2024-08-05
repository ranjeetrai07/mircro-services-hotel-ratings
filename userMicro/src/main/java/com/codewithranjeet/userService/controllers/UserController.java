package com.codewithranjeet.userService.controllers;

import com.codewithranjeet.userService.entities.User;
import com.codewithranjeet.userService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/test")
	public String hello() {
		return "Hello this is Hello";
	}

	@PostMapping("/createUser")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User user1 = userService.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
	}

	@GetMapping("/{userId}")
	public ResponseEntity<Optional<User>> getSingleUser(@PathVariable String userId){
		Optional<User> user = userService.getUser(userId);
		return ResponseEntity.ok(user);
	}

	@GetMapping("/allUser")
	public ResponseEntity<List<User>> getAllUser(){
		List<User> allUser = userService.getAllUser();
		return ResponseEntity.ok(allUser);
	}
}
