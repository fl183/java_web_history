package com.congzhou.dao.impl;

import com.congzhou.dao.UserDao;
import com.congzhou.model.User;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

    @Override
    public List<User> getList() throws Exception {
        logger.info("get user list ok");
        List<User> retList = new ArrayList<>();
        for (short i = 1; i <= 3; i++) {
            retList.add(new User("" + i, "member" + i, 16 + i, new Date()));
        }
//        throw new Exception("haha");
        return retList;
    }
}
