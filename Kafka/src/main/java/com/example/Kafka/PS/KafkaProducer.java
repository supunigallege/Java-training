package com.example.Kafka.PS;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service

public class KafkaProducer {
    private static final Logger logger= LoggerFactory.getLogger(KafkaProducer.class);
    private KafkaTemplate<String,String> KafkaTemplate;

    /*public KafkaProducer(KafkaTemplate<String,String> KafkaTemplate){

    this.KafkaTemplate=KafkaTemplate;
}*/

    public void send(String message){
        logger.info(String.format("message sent %s",message));
       KafkaTemplate.send("Kafkaprj",message);
    }
    }

