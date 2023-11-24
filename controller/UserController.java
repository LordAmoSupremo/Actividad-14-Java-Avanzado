package com.example.activity14.controller;


import com.example.activity14.UserService;
import com.example.activity14.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createuser(user);

    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("{Id}")
    public User searchUserById(@PathVariable("Id") Long Id) {
        return userService.getUserById(Id);
    }

    @DeleteMapping("{Id}")
    public void deleteUserById(@PathVariable("Id") Long Id) {
        userService.deleteUser(Id);
    }
}
