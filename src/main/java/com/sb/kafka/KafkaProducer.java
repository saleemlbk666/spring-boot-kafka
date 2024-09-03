package com.sb.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void produce(String message){
        kafkaTemplate.send("kafka-topic", message);
        System.out.println("Message is Produced");
    }
}
