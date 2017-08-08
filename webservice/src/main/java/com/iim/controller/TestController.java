package com.iim.controller;

import com.iim.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xibin on 2017/8/9.
 */
@RestController
public class TestController {
    @Autowired
    UserMapper userMapper;
    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello Demo!\n"+userMapper.selectAll().toString();
    }
}
