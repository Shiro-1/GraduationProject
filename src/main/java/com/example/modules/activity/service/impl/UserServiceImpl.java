package com.example.modules.activity.service.impl;

import com.example.modules.activity.entity.User;
import com.example.modules.activity.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements com.example.modules.activity.service.UserService {
    @Autowired
    UserMapper userMapper;

    public List<User> getUsers(){
        return userMapper.getUsers();
    }
    public int Register(User user){
        log.info("Register入参为："+user.toString());
        return userMapper.Register(user);
    }
    public User getUser(String username){
        log.info("getUser的入参为："+username);
        return userMapper.getUser(username);
    }
    public int modify(User user){
        return userMapper.modify(user);
    }
}
