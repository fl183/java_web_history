package com.congzhou.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Date;

@Component
public class Logger {
    @Value("${app.name}")
    private String appName;

    @PostConstruct
    private void init(){
        System.out.println(appName+" logger module init.");
    }

    public void log(String logContent){
        System.out.printf("%tT %s \n", new Date(), logContent);
    }
}
