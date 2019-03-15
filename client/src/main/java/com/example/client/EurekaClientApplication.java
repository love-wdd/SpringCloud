package com.example.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@EnableEurekaClient
@RestController
@RefreshScope
public class EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

    //    @Value("${server.port}")
//    @Value("${spring.application.name}")
    @Value("${hello}")
    String hello;

    @RequestMapping(value = "/hello")
    public String hello() {
        return hello;
    }

}