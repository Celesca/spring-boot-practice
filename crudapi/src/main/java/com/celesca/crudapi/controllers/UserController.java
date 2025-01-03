package com.celesca.crudapi.controllers;

import com.celesca.crudapi.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/user")
    public List<User> getUsers() {
        List<User> data = new ArrayList<User>();
        data.add(new User("John", "Doe"));
        data.add(new User("Jane", "Doe"));
        return data;
    }

}
