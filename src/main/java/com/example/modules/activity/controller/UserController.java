package com.example.modules.activity.controller;
import com.example.modules.activity.entity.User;
import com.example.modules.activity.service.UserService;
import com.example.modules.activity.service.impl.UserServiceImpl;
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
    private UserServiceImpl userService;

    @PostMapping("/select")
    public List Select(){
        return userService.getUsers();
    }
    @PostMapping("/login")
    public String Login(String username,String password){
        log.info("用户输入的登录信息：username = "+username+",password:"+password);
        if(username.equals("")||password.equals("")){
            return "用户名和密码不准为空！";
        }
        User user = new User();
        user.setUserName(username);
        user = userService.getUser(user);
        if(user == null){
            return "账号未注册！";
        }
        else if(user.getPassWord().equals(password)){
            return "登录成功！"+"Your Name is"+username+";Your password is"+password;
        }
        return "登录失败！请检查账号信息！";
    }
    @PostMapping("/register")
    public String Register(String userName,String passWord,String name,int phone ) {
        User user = new User(userName,passWord,0,name,phone,"",1);

        int flag = userService.Register(user);
        if(flag == 1)
        {
            return "注册成功！";
        }else
        {
            return "注册失败！";
        }
    }
    @PostMapping("/modify")
    public String Modify(String username,String password,String name,int phone ){
        if(password==null){
            return "密码不许为空！";
        }
        User user = new User(username,password,0,name,phone,"",1);
        int flag = userService.modify(user);
        if(flag==1){
            return "修改成功！";
        }
        return "修改信息失败！请联系系统管理员！";
    }
}
