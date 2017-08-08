package com.iim.service;

import com.iim.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xibin on 2017/8/9.
 */
@Service
public class UserService {
    @Autowired
    UserDao userDao;
}
