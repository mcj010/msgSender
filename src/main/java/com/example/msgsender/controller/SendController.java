package com.example.msgsender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.msgsender.sender.SinkSender;	

@RestController
public class SendController {

	@Autowired
    SinkSender sender;
	
    @RequestMapping("/send/{msg}")	
    public void send(@PathVariable("msg") String msg)
    {
        sender.send("生产者发送消息:" + msg);
    }
    

}
