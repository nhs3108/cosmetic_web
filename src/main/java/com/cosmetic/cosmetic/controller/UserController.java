package com.cosmetic.cosmetic.controller;

import com.cosmetic.cosmetic.entity.User;
import com.cosmetic.cosmetic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/add")
    public User getUser() {
        User user = new User();
        user.setUserName("tungvu318");
        user.setAddress("hn");
        user.setEmail("tungvu31010@gmail.com");
        user.setFullName("Vu Van Tung");
        user.setPhone("123456");
        user.setPassword(passwordEncoder.encode("123456"));
        userService.addUser(user);
        return user;
    }
}
