package com.boot.web;

import com.boot.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Admin on 2017/6/20.
 */
@Configuration
public class ConsumerWeb extends WebMvcConfigurerAdapter {

    @Autowired
    private HelloService helloService;

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        String s = helloService.helloService();
        System.out.println("index调用别的微服务的rest服务：" + s);
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/action").setViewName("sub/action");
    }
//    @RequestMapping(value = "/index", method = RequestMethod.GET)
//    public String index() {
//        String s = helloService.helloService();
//        System.out.println("index调用别的微服务的rest服务：" + s);
//        return "index";
//    }
//
//    @RequestMapping(value = "/action", method = RequestMethod.GET)
//    public String action() {
//        String s = helloService.helloService();
//        System.out.println("action调用别的微服务的rest服务：" + s);
//        return "static/sub/action";
//    }
}
