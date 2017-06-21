package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by Admin on 2017/6/20.
 */
@EnableZuulProxy
@SpringCloudApplication
public class Ch711Application {

    public static void main(String[] args) {
        System.out.println("打印网关参数: " + args);
        SpringApplication.run(Ch711Application.class, args);
    }
}
