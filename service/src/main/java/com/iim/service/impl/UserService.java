package com.iim.service.impl;

import com.iim.model.entity.User;
import com.iim.service.IUserService;
import com.iim.service.base.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by xibin on 2017/8/9.
 */
@Service
@Transactional
public class UserService extends BaseService<User> implements IUserService {

    public List<User> getAllUser() {
        return selectAll();
    }
}
