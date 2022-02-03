package com.example.messagewriter.config;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.example.messagewriter.controller.NewController;

@Component
@ApplicationPath("api")
public class JerseyConfig extends ResourceConfig {

    @PostConstruct
    private void init() {
        registerClasses(NewController.class);
    }
}