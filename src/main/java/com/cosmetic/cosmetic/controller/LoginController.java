package com.cosmetic.cosmetic.controller;

import com.cosmetic.cosmetic.entity.User;
import com.cosmetic.cosmetic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/handle-login")
    public String handleLogin(
            @RequestParam String username, String password,
            HttpSession httpSession) {
        User user = userService.getUser(username, password);
        if (user == null) {
            // login fail
            return "redirect:/error-login";
        } else {
            // login success => set sessionId of user
            user.setSessionId(httpSession.getId());
            userService.updateUser(user);
            return "redirect:/home";
        }
    }


    @GetMapping("/error-login")
    public String errorLogin(Model model) {
        model.addAttribute("messege", "Incorect username or password");
        return "error";
    }

    @GetMapping("/home")
    public String home(@CookieValue(value = "JSESSIONID", defaultValue = "") String cookieValue) {
        User user = userService.getUser(cookieValue);
        if (user == null) {
            return "redirect:/login"; // require login before access page login
        }
        return "home";
    }
}
