package com.boot.service;

import com.boot.dao.PersonDAO;
import com.boot.dto.Person;
import com.boot.util.RedisServletRequest;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

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

        //浏览器cookie传来的session id
        String cookie = request.getHeader("Cookie");
        logger.info("来自浏览器cookie存储的session id" + cookie);

        //Redis服务器存储的Session id
        String sessionId = personDAO.getPerson().getSessionId();
        logger.info("来自redis" + cookie);

        if (StringUtils.isNotEmpty(cookie) && StringUtils.isNotEmpty(sessionId) && cookie.equals(sessionId)) {
            //业务逻辑代码
            logger.info("有关公共Session的业务逻辑验证成功");
        }
        return person;
    }
}
