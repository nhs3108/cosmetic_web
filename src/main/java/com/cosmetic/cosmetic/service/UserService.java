package com.cosmetic.cosmetic.service;


import com.cosmetic.cosmetic.entity.User;

import java.util.List;

public interface UserService {
    User addUser (User user);

    User getUser(String sessionId);

    User getUser (String username, String password);

    void updateUser (User user);

    List<User> getAllUsers();
}
