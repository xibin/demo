package com.iim.amq.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * Created by xibin on 2017/8/9.
 */
@Component
@RabbitListener(queues = "demo-queue")
public class Listener {

    private final static Logger logger = LoggerFactory.getLogger(Listener.class);

    @Bean
    private Queue queue() {
        return new Queue("demo-queue");
    }

    @RabbitHandler
    public void process(@Payload String payload) {
        logger.info(payload);
    }
}
