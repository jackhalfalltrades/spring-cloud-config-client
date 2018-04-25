package com.spring.cloud.kafka.service;

import com.spring.cloud.kafka.model.Payload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaSender.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public Payload sendMessage (Payload payload) {

        LOGGER.info("sending message: " + payload.getMessage() + "to Kafa topic");
        kafkaTemplate.send("test", payload.getMessage());
        LOGGER.info("message sent successfully");

        return payload;

    }
}
