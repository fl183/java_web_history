package com.congzhou.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private String id;
    private String name;
    private int age;
    private Date registerTime;


    public User(String id, String name, int age, Date registerTime) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.registerTime = registerTime;
    }

    public String getId() {
        return id;
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
}
