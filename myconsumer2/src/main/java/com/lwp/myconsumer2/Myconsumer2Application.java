package com.lwp.myconsumer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class Myconsumer2Application {

    public static void main(String[] args) {
        SpringApplication.run(Myconsumer2Application.class, args);
    }

}

