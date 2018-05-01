package com.jackhalfalltrades.configClient.springconfigclient.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;


@Service
public class ServiceProperties {


    @Value("${cloudMessage}")
    private String cloudMessage;

    @Value("${password}")
    private String password;

    public String getCloudMessage() {
        return cloudMessage;
    }

    public void setCloudMessage(String cloudMessage) {
        this.cloudMessage = cloudMessage;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   /* @PostConstruct
    public String postConstruct() {
        return password;
    }*/
}
