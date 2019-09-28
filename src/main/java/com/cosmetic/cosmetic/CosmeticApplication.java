package com.cosmetic.cosmetic;

import com.cosmetic.cosmetic.dao.UserDAO;
import com.cosmetic.cosmetic.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class CosmeticApplication{
    @Autowired
    private UserDAO userDAO;

    public static void main(String[] args) {
        SpringApplication.run(CosmeticApplication.class, args);
    }

}
