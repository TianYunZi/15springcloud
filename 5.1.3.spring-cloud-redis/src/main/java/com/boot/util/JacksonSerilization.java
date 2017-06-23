package com.boot.util;

import com.boot.dto.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

/**
 * Created by Admin on 2017/6/21.
 */
public class JacksonSerilization {

    @Autowired
    private ObjectMapper mapper;// TODO: 2017/6/21 先放在这，等功能实现了再验证是否能自动注入

    /**
     * 序列化.
     *
     * @param t
     * @return
     */
    public static <T> String writeValueAsString(T t) throws JsonProcessingException {
        if (t == null) {
            throw new NullPointerException("传入的参数不能为空");
        }
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(t);
        return json;
    }

    /**
     * 反序列化.
     *
     * @param json
     * @param valueType
     * @param <T>
     * @return
     * @throws IOException
     */
    public static <T> T readValue(String json, Class<T> valueType) throws IOException {
        if (StringUtils.isNotEmpty(json)) {
            ObjectMapper mapper = new ObjectMapper();
            T t = mapper.readValue(json, valueType);
            return t;
        } else {
            return null;
        }
    }
}
