package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Admin on 2017/6/20.
 * 启动类上的注解可以用{@link org.springframework.cloud.client.SpringCloudApplication 注解替换}
 */
@EnableCircuitBreaker//断路器
@EnableDiscoveryClient
@EnableHystrixDashboard//开启仪表盘
@SpringBootApplication
public class Ch511Application {

    /**
     * @return
     * @LoadBalanced 客户端负载均衡
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(Ch511Application.class, args);
    }
}
