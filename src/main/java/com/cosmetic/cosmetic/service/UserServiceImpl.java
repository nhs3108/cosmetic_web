package com.cosmetic.cosmetic.service;

import com.cosmetic.cosmetic.dao.UserDAO;
import com.cosmetic.cosmetic.dao.UserRepository;
import com.cosmetic.cosmetic.entity.CustomUserDetails;
import com.cosmetic.cosmetic.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

//    @Autowired
//    private UserDAO userDAO;
//

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
//        userDAO.addUser(user);
        userRepository.save(user);
        return user;
    }

    @Override
    public List<User> getAllUsers() {
//        return userDAO.getAllUsers();
        return userRepository.findAll();
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userDAO.getUserByUserName(username);
        User user = userRepository.findByUserName(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return new CustomUserDetails(user);
    }
}
