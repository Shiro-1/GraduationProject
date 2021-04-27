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

import javax.servlet.http.HttpServletRequest;
import javax.websocket.Session;
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
    public String Login(HttpServletRequest request, String username, String password){
        log.info("用户输入的登录信息：username = "+username+",password:"+password);
        Result<User> result = new Result<>();
        if(username.equals("")||password.equals("")||username.isEmpty()||password.isEmpty()){
            result.setWords("用户名和密码不准为空！");
            result.setState("1001");
            return tools.toJson(result);
        }
        User user = userService.getUser(username);
        if(user == null){
            result.setWords("账号未注册！");
            result.setState("1002");
            return tools.toJson(result);
        }
        else if(user.getUserPassword().equals(password)){
            result.setWords("登录成功！");
            result.setState("0000");
            result.setObject(user);
            log.info("返回参数为："+tools.toJson(user));
            return tools.toJson(result);
        }
        result.setWords("登录失败！密码错误！请检查账号信息！");
        result.setState("1000");
        return tools.toJson(result);
    }

    @PostMapping("/register")
    public String Register(String userName,String passWord,String name,String phone ) {
        User user = new User();
        User active = userService.getUser(userName);
        //判断注册名是否已存在
        if(active!=null){
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
    public String Modify(String username,String password,String name,String phone ){
        if(username==null||password==null){
            return "用户名密码不许为空！";
        }
        User oldUser = userService.getUser(username);
        User user = new User();
        int flag = userService.modify(user);
        if(flag==1){
            return "修改成功！";
        }
        return "修改信息失败！请联系系统管理员！";
    }

}
