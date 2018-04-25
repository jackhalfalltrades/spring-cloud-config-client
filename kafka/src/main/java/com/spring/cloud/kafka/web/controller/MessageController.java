package com.spring.cloud.kafka.web.controller;

import com.spring.cloud.kafka.model.Payload;
import com.spring.cloud.kafka.service.KafkaSender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageController.class);

    @Autowired
    private KafkaSender kafkaSender;

    @PostMapping(value = "/messaging/send", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody Payload sendMessage(@RequestBody Payload payload) {

        LOGGER.info("initiated posting to kafka");
        return kafkaSender.sendMessage(payload);
    }
}
