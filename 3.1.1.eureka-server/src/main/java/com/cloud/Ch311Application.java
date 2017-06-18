package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by XJX on 2017/6/18.
 */
@EnableEurekaServer
@SpringBootApplication
public class Ch311Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Ch311Application.class).web(true).run(args);
    }
}
