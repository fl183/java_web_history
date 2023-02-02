package com.congzhou.controller;

import com.congzhou.component.res.Result;
import com.congzhou.component.res.ResultCodeMessage;
import com.congzhou.model.User;
import com.congzhou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping(path = "user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(path = "/about")
    public String printHello() {
        return "Here is the info about users.";
    }

    @GetMapping(path = "/say")
    public String say(){
        return userService.say();
    }

    @GetMapping(path = "/getList")
    public Result<List<User>> getUserList(HttpServletRequest request, HttpServletResponse response) throws Exception{
        response.setContentType("application/json;charset=UTF-8");
        return new Result<List<User>>(ResultCodeMessage.SUCCESS, userService.getList());
    }
}
