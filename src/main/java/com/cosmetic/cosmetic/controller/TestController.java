package com.cosmetic.cosmetic.controller;


import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("session")
public class TestController {
    int x = 10;
    @GetMapping("/")
    public String home() {
        int c = this.x++;
        String a = "" + c;
        return a;
    }
}
