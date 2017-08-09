package com.iim.controller;

import com.iim.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xibin on 2017/8/9.
 */
@RestController
public class TestController {
    private final static Logger log = LoggerFactory.getLogger(TestController.class);
    @Autowired
    IUserService userService;
    @RequestMapping("/hello")
    public String sayHello(){
        log.info(userService.getAllUser().toString());
        return "Hello Demo!<br>" + userService.getAllUser();
    }
}
