package com.cloud.kafka.listener;

import org.springframework.kafka.annotation.KafkaListener;


public class EventMessageListener {

    {
        System.out.println("监听器已经启动......");
    }
    @KafkaListener(topics = "test",group = "test-consumer-group")
    public void onMessage(String msg){
        System.out.println(System.currentTimeMillis() + "received message  " + msg);
    }




}
