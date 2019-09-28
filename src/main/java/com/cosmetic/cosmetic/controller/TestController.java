package com.cosmetic.cosmetic.controller;


import com.cosmetic.cosmetic.entity.User;
import com.cosmetic.cosmetic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
//
//@RestController
//@Scope("session")
@Controller
public class TestController {
    @Autowired
    private UserService userService;

    @GetMapping("/getall")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
//    int x = 10;
//    @GetMapping("/")
//    public String home() {
//        int c = this.x++;
//        String a = "" + c;
//        return a;
//    }
    @GetMapping("/index")
    public String home() {
        return "index";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
