package com.ping.eceureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EcEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcEurekaApplication.class, args);
    }

}
