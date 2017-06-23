package com.boot.service;

import com.boot.dao.PersonDAO;
import com.boot.dto.Person;
import com.boot.util.RedisServletRequest;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Admin on 2017/6/21.
 */
@Service
public class RedisSessionServiceImpl implements RedisSessionService {

    private static Logger logger = Logger.getLogger(RedisSessionServiceImpl.class);

    @Autowired
    private PersonDAO personDAO;

    @Override
    public Person getSessionBody(HttpServletRequest request) {
        Person person = new Person();

        //浏览器cookie传来的session id，todo 需修改
        logger.info("来自浏览器cookie存储的session id: " + request.getHeader("Cookie"));

        Cookie[] cookies = request.getCookies();
        String cookie = null;
        if (cookies != null) {
            for (Cookie cookie1 : cookies) {
                if (cookie1.getName().equals("MySessionId")) {
                    cookie = cookie1.getValue();
                    logger.info("来自浏览器cookie存储的my session id: " + cookie);
                }
            }
        }

        //本节点产生Session Id
        HttpSession session = request.getSession(true);
        logger.info("本节点产生的Session Id: " + session.getId());

        //Redis服务器存储的Session id
        String sessionId = personDAO.getPerson() == null ? null : personDAO.getPerson().getSessionId();
        logger.info("来自redis: " + cookie);

        if (StringUtils.isNotEmpty(cookie) && StringUtils.isNotEmpty(sessionId) && cookie.equals(sessionId)) {
            //业务逻辑代码
            logger.info("有关公共Session的业务逻辑验证成功");
        }
        return person;
    }
}
