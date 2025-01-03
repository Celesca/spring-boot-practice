package com.hack2gather.Firstapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    public String display() {
        return "Hello Spring boot!";
    }

    @GetMapping("/about")
    public String about() {
        return "This is a simple Spring Boot application";
    }

}
