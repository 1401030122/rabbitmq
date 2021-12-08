package com.zhaojie.receive;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Author ZhaoJie
 * @Version 1.0
 * @Data 08 11:55
 * @Email 17854262969@163.com
 */
@Component
@RabbitListener(queues = "topic.woman")
public class TopicTotalReceiver {
    @RabbitHandler
    public void topicTotalReceiver(Map testMessage){
        System.out.println("TopicTotalReceiver消费者收到消息  : " + testMessage.toString());
    }
}
