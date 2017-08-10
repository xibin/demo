package com.iim.service;

import com.iim.model.entity.User;
import com.iim.service.base.IService;

import java.util.List;

/**
 * Created by xibin on 2017/8/9.
 */
public interface IUserService extends IService<User> {
    List<User> getAllUser();
}
