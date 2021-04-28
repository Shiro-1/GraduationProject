package com.example.modules.activity.service;

import com.example.modules.activity.entity.User;

import java.util.List;


public interface UserService {
    //获取所有用户信息
    List<User> getUsers();
    //用户注册
    int Register(User user);
    //获取具体用户信息
    User getUser(String username);
    //用户信息修改
    int modify(User user);
}
