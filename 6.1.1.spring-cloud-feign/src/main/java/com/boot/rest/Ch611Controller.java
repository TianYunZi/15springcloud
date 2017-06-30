package com.boot.rest;

import com.boot.model.User;
import com.boot.service.RefactorHelloService;
import com.boot.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Admin on 2017/6/29.
 */
@RestController
public class Ch611Controller {

    @Autowired
    private HelloService helloService;

    @Autowired
    private RefactorHelloService refactorHelloService;

    @RequestMapping(value = "/feign-consumer", method = RequestMethod.GET)
    public String helloConsumer() {
        return helloService.hello();
    }

    @RequestMapping(value = "/feign-consumer2", method = RequestMethod.GET)
    public String helloConsumer2() {
        StringBuilder builder = new StringBuilder();
        builder.append(helloService.hello()).append("\n");
        builder.append(helloService.hello("DIDI")).append("\n");
        builder.append(helloService.hello("DIDI", 30)).append("\n");
        builder.append(helloService.hello(new User("DIDIUser", 30))).append("\n");
        return builder.toString();
    }

    /**
     * 调用hello-service-api
     * @return
     */
    @RequestMapping(value = "/feign-consumer3", method = RequestMethod.GET)
    public String helloConsumer3(){
        StringBuilder builder = new StringBuilder();
        builder.append(refactorHelloService.hello("DIDI")).append("\n");
        builder.append(refactorHelloService.hello("DIDI", 30)).append("\n");
        builder.append(refactorHelloService.hello(new com.refactor.dto.User("DIDIUser", 30))).append("\n");
        return builder.toString();
    }

}
