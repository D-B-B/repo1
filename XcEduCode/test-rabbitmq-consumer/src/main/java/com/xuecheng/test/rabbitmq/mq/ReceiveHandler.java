package com.xuecheng.test.rabbitmq.mq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.AMQP;
import com.xuecheng.test.rabbitmq.config.RabbitConfig;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class ReceiveHandler {

    @RabbitListener(queues = {RabbitConfig.QUEUE_INFORM_EMAIL})
    public void send_email(String msg, Message message,Channel channel){
        System.out.println("receive message is:"+msg);
    }

    //监听sms队列
    @RabbitListener(queues = {RabbitConfig.QUEUE_INFORM_SMS})
    public void receive_sms(String msg,Message message,Channel channel){
        System.out.println(msg);
    }

}
