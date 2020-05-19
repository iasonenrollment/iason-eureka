package com.iason.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class IasonEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(IasonEurekaApplication.class, args);
    }

}
