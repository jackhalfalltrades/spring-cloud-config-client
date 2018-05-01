package com.jackhalfalltrades.configClient.springconfigclient.web.controller;

import com.jackhalfalltrades.configClient.springconfigclient.service.ServiceProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    ServiceProperties serviceProperties;

    @GetMapping(value="/")
    public String getValue() {
        return serviceProperties.getCloudMessage() + " --- " +serviceProperties.getPassword();
    }
}
