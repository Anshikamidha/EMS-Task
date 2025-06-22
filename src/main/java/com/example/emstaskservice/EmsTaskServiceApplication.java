package com.example.emstaskservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EmsTaskServiceApplication {

    public static void main(String[] args) {

        // This method is intentionally left minimal.
        // It serves as the entry point for the Spring Boot application.
        SpringApplication.run(EmsTaskServiceApplication.class, args);
    }

}
