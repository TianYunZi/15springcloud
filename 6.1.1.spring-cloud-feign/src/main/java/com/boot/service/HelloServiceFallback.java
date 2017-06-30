package com.boot.service;

import com.boot.model.User;
import org.springframework.stereotype.Component;

/**
 * Created by Admin on 2017/6/29.
 * 熔断机制
 */
@Component
public class HelloServiceFallback implements HelloService {
    @Override
    public String hello() {
        return "error";
    }

    @Override
    public String hello(String name) {
        return "error";
    }

    @Override
    public User hello(String name, Integer age) {
        return new User("未知", 0);
    }

    @Override
    public String hello(User user) {
        return "error";
    }
}
