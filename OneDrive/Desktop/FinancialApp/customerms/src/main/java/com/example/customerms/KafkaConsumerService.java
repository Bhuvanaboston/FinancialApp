package com.example.customerms;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "my-topic", groupId = "my-group")
    public void listen(CreditInfo message) {
        System.out.println("Received Message: " + message);
    }
}