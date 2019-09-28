package com.cosmetic.cosmetic.service;

import com.cosmetic.cosmetic.dao.UserRepository;
import com.cosmetic.cosmetic.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
//        userDAO.addUser(user);
        userRepository.save(user);
        return user;
    }

    @Override
    public User getUser(String sessionId) {
        return userRepository.findBySessionId(sessionId);
    }

    @Override
    public User getUser(String username, String password) {
        return userRepository.findByUserNameAndPassword(username, password);
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
//        return userDAO.getAllUsers();
        return userRepository.findAll();
    }

}
