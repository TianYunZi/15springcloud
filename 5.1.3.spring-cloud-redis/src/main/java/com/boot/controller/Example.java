package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Admin on 2017/6/22.
 */
@RestController
public class Example {

    @RequestMapping("/set")
    public String set(HttpServletRequest req, HttpServletResponse response) {
        HttpSession session = req.getSession();
        if (session != null) {
            session.setAttribute("testKey", "testValue");
            Cookie cookie = new Cookie("JSESSIONID", session.getId());
            cookie.setMaxAge(24 * 60 * 60);
            response.addCookie(cookie);
        }
        System.out.println("Session id值：" + session.getId());
        return "设置session:testKey=testValue" + "redis存储的Session值：" + session.getId();
    }

    @RequestMapping("/query")
    String query(HttpServletRequest req, HttpServletResponse response) {
        Object value = req.getSession().getAttribute("testKey");
        Cookie[] cookies = req.getCookies();
        String session = null;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("JSESSIONID")) {
                    session = cookie.getValue();
                }
            }
        }
        System.out.println("Session id值：" + req.getSession().getId());
        System.out.println("浏览器Jessionid值：" + session);
        return "查询Session：\"testKey\"=" + value + "浏览器JSESSIONID: " + session;
    }
}
