package com.example.Kafka.Controller;

import com.example.Kafka.PS.KafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v5/KafkaController")
public class KafkaController {


    KafkaProducer KafkaProducer;
    public KafkaController(KafkaProducer KafkaProducer){
        this.KafkaProducer=KafkaProducer;
    }
    //https://localhost:9092/api/v1/kafka/publish?message="hi"
/*@GetMapping(path = "/publish")
public ResponseEntity<String> public(@RequestParam("Message") String message ){

        KafkaProducer.send(message);
        return ResponseEntity.ok("message sent");
    }*/
}
