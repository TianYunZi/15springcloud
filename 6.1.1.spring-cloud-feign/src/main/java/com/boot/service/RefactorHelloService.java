package com.boot.service;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by Admin on 2017/6/29.
 */
@FeignClient(value = "HELLO-SERVICE")
public interface RefactorHelloService extends com.refactor.service.HelloService {
}
