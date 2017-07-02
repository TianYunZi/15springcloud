package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by Admin on 2017/6/30.
 */
@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class Ch811Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch811Application.class, args);
    }
}
