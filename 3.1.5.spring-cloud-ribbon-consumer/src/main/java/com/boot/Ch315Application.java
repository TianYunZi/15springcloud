package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by XJX on 2017/6/18.
 */
@EnableDiscoveryClient//Eureka客户端
@SpringBootApplication
public class Ch315Application {

    @Bean
    @LoadBalanced//开启客户端的负载均衡
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(Ch315Application.class, args);
    }
}
