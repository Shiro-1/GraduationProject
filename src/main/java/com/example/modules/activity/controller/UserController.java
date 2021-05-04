package com.example.modules.activity.controller;
import com.example.modules.activity.entity.Result;
import com.example.modules.activity.entity.User;
import com.example.modules.activity.service.UserService;
import com.example.modules.activity.tools.tools;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController extends tools {

    @Autowired
    private UserService userService;

    @PostMapping("/select")
    public List Select(){
        return userService.getUsers();
    }

    @PostMapping("/login")
    public Result<User> Login(String username, String password){
        log.info("用户输入的登录信息：username = "+username+",password="+password);
        Result<User> result = new Result<>();
        if(username.equals("")||password.equals("")||username==null||password==null){
            result.setWords("用户名和密码不准为空！");
            result.setState("1001");
            return result;
        }
        User user = userService.getUser(username);
        if(user == null||user.getUserState()==0){
            result.setWords("用户不存在或用户已被注销！");
            result.setState("1002");
            return result;
        }
        else if(user.getUserPassword().equals(password)){
            result.setWords("登录成功！");
            result.setState("0000");
            result.setObject(user);
            log.info("返回参数为："+tools.toJson(user));
            return result;
        }
        result.setWords("登录失败！密码错误！请检查账号信息！");
        result.setState("1000");
        log.info("返回参数为："+tools.toJson(result));
        return result;
    }

    @PostMapping("/register")
    public String Register(String userName,String passWord,int level,String name,String phone,String department,int state ) {
        User user = new User(userName,passWord,level,name,phone,department,state);
        User active = userService.getUser(userName);
        //判断账号是否已存在
        if(active!=null&&active.getUserState()==1){
            return "该用户已存在！";
        }
        //进行用户注册
        int flag = userService.Register(user);
        if(flag == 1){
            return "注册成功！";
        }
        else {
            return "注册失败！";
        }
    }

    @PostMapping("/modify")
    public String Modify(String userName,String passWord,int level,String name,String phone,String department,int state ){
        if(userName==null||passWord==null){
            return "用户名密码不许为空！";
        }
        User oldUser = userService.getUser(userName);
        if(oldUser==null){
            return "用户不存在或用户已被注销";
        }
        oldUser.setUserPassword(passWord);
        oldUser.setUserLevel(level);
        oldUser.setUserName(name);
        oldUser.setUserPhone(phone);
        oldUser.setUserPartment(department);
        oldUser.setUserState(state);
        int flag = userService.modify(oldUser);
        if(flag==1){
            return "修改成功！";
        }
        return "修改信息失败！请联系系统管理员！";
    }

}
