package com.congzhou.aop;

public class ServiceSayHandler {
    public void beforeSay(){
        System.out.println("---one service will say---");
    }

    public void afterSay(){
        System.out.println("---one service has finished saying---");
    }
}
