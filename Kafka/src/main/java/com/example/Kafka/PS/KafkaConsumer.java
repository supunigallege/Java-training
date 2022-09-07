package com.example.Kafka.PS;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;

public class KafkaConsumer {
    private static final Logger logger= LoggerFactory.getLogger(KafkaConsumer.class);
    @KafkaListener(topics = "Kafkaprj",groupId = "Kafkaprj1")
    public void consume(String message){
        logger.info(String.format("message Recieved-%s",message));
    }
    private org.springframework.kafka.core.KafkaTemplate<String,String> KafkaTemplate;
}
