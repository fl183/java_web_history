package com.congzhou.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Date;

@Component
public class AppInfo {
    @Value("${app.name}")
    private String appName;

    @PostConstruct
    private void init(){
        System.out.println(appName+" AppInfo module init.");
    }

    public String getInfo(){
        return String.format("time:%tT, appName:%s \n", new Date(), appName);
    }
}
