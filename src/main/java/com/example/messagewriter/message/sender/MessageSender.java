package com.example.messagewriter.message.sender;

import javax.jms.Queue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.example.messagewriter.message.MyMessage;

@Service
public class MessageSender {

    private static Logger log = LoggerFactory.getLogger(MessageSender.class);

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private Queue queue;
    
    public void send(MyMessage myMessage) {
        log.info("sending with convertAndSend() to queue <" + myMessage + ">");
        jmsTemplate.convertAndSend(queue, myMessage);
    }
}
