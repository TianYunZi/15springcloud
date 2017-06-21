package com.boot.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Admin on 2017/6/21.
 */
public class RedisServletRequest {

    private HttpServletRequest request;

    public RedisServletRequest(HttpServletRequest request) {
        this.request = request;
    }

    public HttpSession getSession() {

        //浏览器Cookie存储的Session Id
        String cookie = request.getHeader("Cookie");
        return request.getSession();
    }
}
