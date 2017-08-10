package com.iim.amq.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by xibin on 2017/8/9.
 */
@Component
public class Sender {

    private final static Logger logger = LoggerFactory.getLogger(Sender.class);

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Async
    public void send(String message) {
        this.rabbitTemplate.convertAndSend("demo-queue", message);
        logger.info(message);
    }
}
