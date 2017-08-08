package com.iim.dao;

import com.iim.mapper.UserMapper;
import com.iim.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xibin on 2017/8/9.
 */
@Service
public class UserDao {
    @Autowired
    private UserMapper userMapper;

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public User getUserByName(String userName){
        User queryUser = new User();
        queryUser.setUserName(userName);
        return userMapper.selectOne(queryUser);
    }
}
