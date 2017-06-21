package com.boot.service;

import com.boot.dto.Person;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Admin on 2017/6/21.
 */
public interface RedisSessionService {

    Person getSessionBody(HttpServletRequest request);
}
