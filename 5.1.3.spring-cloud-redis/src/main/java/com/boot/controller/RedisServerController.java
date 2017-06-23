package com.boot.controller;

import com.boot.dto.Person;
import com.boot.service.RedisSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Admin on 2017/6/21.
 */
@RestController
public class RedisServerController {

    @Autowired
    private RedisSessionService redisSessionService;

    @ResponseBody
    @RequestMapping(value = "/session", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType
            .APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public Person getSessionId(HttpServletRequest request) {
        Person sessionBody = redisSessionService.getSessionBody(request);
        return sessionBody;
    }
}
