package com.congzhou.service;

import org.springframework.stereotype.Service;

@Service
public class RoleService {
    public String say(){
        String sayContent = "oh oh";
        System.out.println(sayContent);
        return sayContent;
    }
}