package com.sb.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "kafka-topic", groupId = "kafka-group")
    public void receiveMessages(String message){
        System.out.println("Received Message from kafka: "+ message);
    }
}
