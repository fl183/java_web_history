package com.congzhou.aop;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceSayHandler {

    @Pointcut("execution(* com.congzhou.service.*.say())")
    public void serviceSayHandler() {
    }

    @Before("serviceSayHandler()")
    public void beforeSay() {
        System.out.println("---one service will say---");
    }

    @After("serviceSayHandler()")
    public void afterSay() {
        System.out.println("---one service has finished saying---");
    }
}
