package com.iim.service;

import com.iim.dao.UserDao;
import com.iim.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xibin on 2017/8/9.
 */
@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public User getUserByName(String userName){
        User queryUser = new User();
        queryUser.setUserName(userName);
        return userDao.getUserMapper().selectOne(queryUser);
    }

    public List<User> getAllUser() {
        return userDao.getUserMapper().selectAll();
    }
}
