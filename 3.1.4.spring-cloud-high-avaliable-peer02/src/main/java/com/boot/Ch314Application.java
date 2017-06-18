package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by XJX on 2017/6/18.
 */
@SpringBootApplication
@EnableEurekaServer
public class Ch314Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch314Application.class, args);
    }
}
