package com.boot.dao;

import com.boot.dto.Person;
import com.boot.util.JacksonSerilization;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Admin on 2017/6/14.
 */
@Repository
public class PersonDAO {

    private static Logger logger = Logger.getLogger(PersonDAO.class);

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Resource(name = "redisTemplate")
    private ValueOperations<Object, Object> valueOperations;

    public void save(Person person) {
        String json = null;
        try {
            json = JacksonSerilization.writeValueAsString(person);
        } catch (JsonProcessingException e) {
            logger.debug("对象序列化成json异常：" + e.getMessage(), e);
        }
        valueOperations.set("sessionId", json, 1L, TimeUnit.DAYS);
    }

    public Person getPerson() {
        String sessionId = (String) valueOperations.get("sessionId");
        Person person = null;
        try {
            person = JacksonSerilization.readValue(sessionId, Person.class);
        } catch (IOException e) {
            logger.debug("反序列化成对象异常：" + e.getMessage(), e);
        }
        return person;
    }
}
