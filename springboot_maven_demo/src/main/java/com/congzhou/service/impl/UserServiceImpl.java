package com.congzhou.service.impl;

import com.congzhou.dao.UserDao;
import com.congzhou.model.User;
import com.congzhou.service.UserService;
import com.congzhou.util.AppInfo;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    // 统一使用基于构造函数方法注入bean，否则易出现使用时值为null的情况
    @Autowired
    public UserServiceImpl(UserDao userDao, AppInfo appInfo) {
        this.userDao = userDao;
        logger.info(appInfo.getInfo());
    }

    @Override
    public String say() {
        String sayContent = "hey yeah";
        System.out.println(sayContent);
        return sayContent;
    }

    @Override
    public List<User> getList() throws Exception{
        logger.info("获取用户列表");
        return userDao.getList();
    }
}
