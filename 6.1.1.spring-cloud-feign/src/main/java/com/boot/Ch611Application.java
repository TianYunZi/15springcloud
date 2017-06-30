package com.boot;

import feign.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

/**
 * Created by Admin on 2017/6/29.
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class Ch611Application {

    /**
     * 开启日志
     *
     * @return
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    public static void main(String[] args) {
        SpringApplication.run(Ch611Application.class, args);
    }
}
