package com.congzhou;

import com.congzhou.service.RoleService;
import com.congzhou.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("app-context.xml");

        UserService oneUserService = (UserService) appContext.getBean("userService");
        oneUserService.say(); // 验证IoC： 打印 hey yeah
        oneUserService.getList(); // 验证DI： 打印 get user list ok

        RoleService oneRoleService = (RoleService) appContext.getBean("roleService");
        oneRoleService.say();
    }
}
