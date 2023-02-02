package com.congzhou.dao;

import com.congzhou.model.User;

import java.util.List;

public interface UserDao {
    public List<User> getList() throws Exception;
}
