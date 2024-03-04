package com.kafka.streaming;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "bogdanstopic", groupId = "myGroup")
    void listener(String data) {
        System.out.println("Received: " + data);
    }
}
