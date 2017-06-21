package com.boot.dto;

/**
 * Created by Admin on 2017/6/21.
 */
public class Person {

    private String name;

    private Integer age;

    private String gender;

    private String sessionId;

    public Person() {
    }

    public Person(String name, Integer age, String gender, String sessionId) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.sessionId = sessionId;
    }

    public Person(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", sessionId='" + sessionId + '\'' +
                '}';
    }
}
