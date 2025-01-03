package com.celesca.crudapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/users")
    public String getUsers() {
        return "All users";
    }

    @GetMapping("/about")
    public String getAbout() {
        return "เกี่ยวกับเรา";
    }

    @GetMapping("/contact")
    public String getContact() {
        return "ติดต่อเรา";
    }

}
