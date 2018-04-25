package com.bert.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class KafkaController {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;
    
    /**
     * 发送消息到topic:test
     * @param model
     * @return
     */
    @RequestMapping(value = "sendTopic1", method = RequestMethod.GET)
    @ResponseBody
    public String sendGroup1(Model model) {
        String msg = "hello1 "+ System.currentTimeMillis();
        //topic = test
        System.out.println("produce test message:" + msg);
        kafkaTemplate.send("test",msg);
        return "success";
    }
    
    /**
     * 发送消息到topic:lzz
     * @param model
     * @return
     */
    @RequestMapping(value = "sendTopic2", method = RequestMethod.GET)
    @ResponseBody
    public String sendGroup2(Model model) {
        String msg = "hello2 "+ System.currentTimeMillis();
        //topic = test
        System.out.println("produce lzz message:" + msg);
        kafkaTemplate.send("lzz",msg);
        return "success";
    }

}