package com.example.modules.activity.service.impl;

import com.example.modules.activity.entity.User;

import java.util.List;

public interface UserServiceImpl {
    public List<User> getUsers();
    public int Register(User user);
    public User getUser(User user);
    public int modify(User user);
}
