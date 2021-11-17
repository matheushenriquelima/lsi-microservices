package com.matheus.lima.messagin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MessaginApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessaginApplication.class, args);
    }

}
