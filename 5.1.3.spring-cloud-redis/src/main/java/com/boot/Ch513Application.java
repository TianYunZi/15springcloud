package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Admin on 2017/6/21.
 */
@EnableDiscoveryClient//Eureka客户端
@SpringBootApplication
public class Ch513Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch513Application.class, args);
    }
}
