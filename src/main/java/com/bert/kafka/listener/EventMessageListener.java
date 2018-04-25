package com.bert.kafka.listener;

import org.springframework.kafka.annotation.KafkaListener;


public class EventMessageListener {

    {
        System.out.println("监听器已经启动......");
    }
    
    @KafkaListener(topics = "test",group = "test-consumer-group")
    public void onMessage1(String msg){
        System.out.println("consume test message:" + msg);
    }
    
    
    
    @KafkaListener(topics = "lzz",group = "test-consumer-group")
    public void onMessage2(String msg){
        System.out.println("consume lzz message:" + msg);
    }




}
