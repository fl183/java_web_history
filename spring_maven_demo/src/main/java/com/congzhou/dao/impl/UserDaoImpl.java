package com.congzhou.dao.impl;

import com.congzhou.dao.UserDao;
import com.congzhou.model.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public List<User> getList() {
        System.out.println("get user list ok");
        List<User> retList = new ArrayList<User>();
        for (short i = 1; i <= 3; i++) {
            retList.add(new User("" + i, "member" + i, 16 + i, new Date()));
        }
        return retList;
    }
}
