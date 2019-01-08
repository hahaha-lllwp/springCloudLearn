package com.lwp.yundemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class YundemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(YundemoApplication.class, args);
    }

}

