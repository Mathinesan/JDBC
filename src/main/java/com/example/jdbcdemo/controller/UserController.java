package com.example.jdbcdemo.controller;

import com.example.jdbcdemo.model.User;
import com.example.jdbcdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping
    public String createUser(@RequestBody User user) {
        userRepository.save(user);
        return "User saved!";
    }
}
