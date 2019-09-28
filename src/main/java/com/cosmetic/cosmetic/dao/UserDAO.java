package com.cosmetic.cosmetic.dao;


import com.cosmetic.cosmetic.entity.User;

import java.util.List;

public interface UserDAO {
    void addUser(User user);

    User getUserByUserName(String userName);

    List<User> getAllUsers();
}
