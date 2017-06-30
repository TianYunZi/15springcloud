package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

/**
 * Created by Admin on 2017/6/28.
 */
@EnableTurbineStream
@SpringBootApplication
@EnableDiscoveryClient
public class Ch515Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch515Application.class, args);
    }
}
