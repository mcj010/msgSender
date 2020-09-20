package com.example.msgsender.sender;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;

@EnableBinding(value = {Source.class})
public class SinkSender {
    @Autowired
    Source source;

    public void send(String message){
        source.output().send(org.springframework.integration.support.MessageBuilder.withPayload(message).build());
    }
}