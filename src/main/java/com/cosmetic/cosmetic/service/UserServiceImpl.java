package com.cosmetic.cosmetic.service;

import com.cosmetic.cosmetic.dao.UserDAO;
import com.cosmetic.cosmetic.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO userDAO;

    @Override
    public User getUser(String email, String password) {
        return userDAO.getUser(email, password);
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }
}
