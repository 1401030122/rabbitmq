package com.zhaojie.receive;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Author ZhaoJie
 * @Version 1.0
 * @Data 08 11:51
 * @Email 17854262969@163.com
 */
@Component
@RabbitListener(queues="topic.man")
public class TopicManReceiver {
    @RabbitHandler
    public void topicManReceiver(Map testMessage){
        System.out.println("TopicManReceiver消费者收到消息  : " + testMessage.toString());
    }
}
