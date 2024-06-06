package com.example.creditms;

import jakarta.ws.rs.QueryParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class KafkaController {

    private final KafkaProducerService producerService;
    private final CreditService creditService;
    @Autowired
    public KafkaController(KafkaProducerService producerService, CreditService creditService) {
        this.producerService = producerService;
        this.creditService = creditService;
    }

    @GetMapping("/creditsKafka/{id}")
    public ResponseEntity<String> publishMessage(@PathVariable Long id) {

        System.out.println("IDDD: "+id);
        CreditInfo message = creditService.findbyId(id);
        producerService.sendMessage("my-topic", message);
        return ResponseEntity.ok("Message published to Kafka topic");
    }
}