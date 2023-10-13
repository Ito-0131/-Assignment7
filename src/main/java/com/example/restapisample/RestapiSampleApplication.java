package com.example.restapisample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.restapisample")
public class RestapiSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestapiSampleApplication.class, args);
    }

}
