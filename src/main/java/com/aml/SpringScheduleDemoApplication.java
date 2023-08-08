package com.aml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringScheduleDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringScheduleDemoApplication.class, args);
    }

}
