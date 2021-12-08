package com.zhaojie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.Console;

@SpringBootApplication
public class RabbitmqProviderApplication {

    public static void main(String[] args) {
        System.out.println("------rabbitMQ provider start successful");
        SpringApplication.run(RabbitmqProviderApplication.class, args);
    }

}
