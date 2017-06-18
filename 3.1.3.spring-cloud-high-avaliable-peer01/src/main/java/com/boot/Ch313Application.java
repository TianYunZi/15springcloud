package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by XJX on 2017/6/18.
 */
@EnableEurekaServer
@SpringBootApplication
public class Ch313Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch313Application.class, args);
    }
}
