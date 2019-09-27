package com.cosmetic.cosmetic.service;


import com.cosmetic.cosmetic.entity.User;

import java.util.List;

public interface UserService {

    User getUser(String email, String password);

    List<User> getAllUsers();
}
