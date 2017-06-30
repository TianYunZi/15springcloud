package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Created by Admin on 2017/6/27.
 */
@EnableTurbine
@EnableDiscoveryClient
@SpringBootApplication
public class Ch514Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch514Application.class, args);
    }
}
