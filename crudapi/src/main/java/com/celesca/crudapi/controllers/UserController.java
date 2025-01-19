package com.celesca.crudapi.controllers;

import com.celesca.crudapi.entity.User;
import com.celesca.crudapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api")
public class UserController {

    public UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public User addUser(@RequestBody User user) {
       user.setId(0);
       return userService.save(user);
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return
    }

}
