package com.vp.user_service.repository;

import com.vp.user_service.dao.UserDao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    public List<UserDao> getAllUsers() {
        UserDao userDao = new UserDao();
        userDao.setUserId(1);
        userDao.setName("John Doe");
        userDao.setEmail("John@gmail.com");

        UserDao userDao2 = new UserDao();
        userDao2.setUserId(2);
        userDao2.setName("Jane Doe");
        userDao2.setEmail("Jane@gmail.com");

        return List.of(userDao, userDao2);
    }
}
