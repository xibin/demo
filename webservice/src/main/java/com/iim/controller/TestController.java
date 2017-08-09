package com.iim.controller;

import com.iim.amq.producer.Sender;
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
    private final static Logger logger = LoggerFactory.getLogger(TestController.class);
    @Autowired
    IUserService userService;
    @Autowired
    Sender sender;
    @RequestMapping("/hello")
    public String sayHello(){
        String queryContent = userService.getAllUser().toString();
        sender.send(queryContent);
        logger.info(queryContent);
        return "Hello Demo!<br>" + queryContent;

    }
}
