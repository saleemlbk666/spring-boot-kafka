package com.sb.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/kafka")
public class KafkaController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @PostMapping("/produce")
    public void produceMessages(@RequestParam("message") final String message){
        kafkaProducer.produce(message);
    }
}
