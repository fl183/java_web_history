package com.congzhou.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private String id;
    private String name;
    private int age;
    private Date registerTime;

    public User() {
        this.registerTime = new Date();
    }

    public User(String id, String name, int age, Date registerTime) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.registerTime = registerTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRegisterTime() {
        SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dataFormat.format(registerTime);
    }

    public String getId() {
        return id;
    }
}
