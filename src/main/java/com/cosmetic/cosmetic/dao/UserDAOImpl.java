package com.cosmetic.cosmetic.dao;

import com.cosmetic.cosmetic.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Component
public class UserDAOImpl implements UserDAO{
    @Autowired
    private EntityManagerFactory entityManagerFactory;

//    @Autowired
//    private PasswordEncoder passwordEncoder;

    @Override
    public void addUser(User user) {
        Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
        session.save(user);
    }

    @Override
    public User getUserByUserName(String userName) {
        Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery criteria = builder.createQuery(User.class);
        Root contactRoot = criteria.from(User.class);
        criteria.where(builder.equal(contactRoot.get("userName"), userName));
        User user = (User)session.createQuery(criteria).getSingleResult();
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery criteria = builder.createQuery(User.class);
        Root contactRoot = criteria.from(User.class);
        criteria.select(contactRoot);
        return session.createQuery(criteria).getResultList();
    }
}
