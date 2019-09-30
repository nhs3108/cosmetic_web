package com.cosmetic.cosmetic.service;


import com.cosmetic.cosmetic.entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    User addUser (User user);
    List<User> getAllUsers();
}
