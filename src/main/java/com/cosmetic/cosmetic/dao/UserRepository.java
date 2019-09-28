package com.cosmetic.cosmetic.dao;

import com.cosmetic.cosmetic.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserName(String userName);

    User findByUserNameAndPassword(String username, String password);

    User findBySessionId(String sessionId);
}
