package com.zhaojie.receive;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Author ZhaoJie
 * @Version 1.0
 * @Data 08 11:09
 * @Email 17854262969@163.com
 */
@Component
@RabbitListener(queues = "TestDirectQueue")//监听的队列名称 TestDirectQueue
public class DirectReceiverA {
    @RabbitHandler
    public void process(Map testMessage){
        System.out.println("-----收到的消息为-----:"+testMessage.toString());
    }
}
