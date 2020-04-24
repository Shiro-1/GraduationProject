package com.example.modules.activity.service;

import com.example.modules.activity.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    List<User> getUsers();
    int Register(User user);
    User getUser(String username);
    int modify(User user);
}
