package com.boot.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;
import java.time.Instant;

/**
 * Created by Admin on 2017/6/20.
 */
@Service
public class HelloService {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private RestTemplate restTemplate;

    /**
     * @return
     * @HystrixCommand 指定回调方法，默认2000熔断触发
     */
    @HystrixCommand(fallbackMethod = "helloFallback")
    public String helloService() {

        Instant start = Instant.now();

        String result = restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();

        Instant end = Instant.now();
        logger.info("Sleep time: " + Duration.between(start, end).toMillis());

        return result;
    }

    public String helloFallback() {
        return "error";
    }
}
