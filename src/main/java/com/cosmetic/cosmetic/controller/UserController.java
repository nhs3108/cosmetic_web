package com.cosmetic.cosmetic.controller;

import com.cosmetic.cosmetic.entity.User;
import com.cosmetic.cosmetic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public User getUser() {
        return userService.getUser("tungvu3181999@gmail.com", "123456");
    }
}
