package com.example.creditms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KafkaProducerService {

    private final KafkaTemplate<String, CreditInfo> kafkaTemplate;

    @Autowired
    public KafkaProducerService(KafkaTemplate<String, CreditInfo> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String topic, CreditInfo message)
    {
        kafkaTemplate.send(topic, message);
    }
}