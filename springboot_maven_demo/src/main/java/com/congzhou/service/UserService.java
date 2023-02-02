package com.congzhou.service;

import com.congzhou.model.User;

import java.util.List;

public interface UserService {
    String say();
    List<User> getList() throws Exception;
}
