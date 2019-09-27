package com.cosmetic.cosmetic.dao;


import com.cosmetic.cosmetic.entity.User;

import java.util.List;

public interface UserDAO {

    User getUser(String email, String password);

    List<User> getAllUsers();
}
