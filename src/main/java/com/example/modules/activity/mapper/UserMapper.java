package com.example.modules.activity.mapper;
import com.example.modules.activity.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    @Select("select * from user")
    List<User> getUsers();
    @Select("select * from user where username = #{username}")
    User getUser(String username);
    @Insert("insert into user (username,password,`rank`,name,phone,title,state) values (#{userName},#{passWord},#{rank},#{name},#{phone},#{title},#{state})")
    int Register(User user);
    @Update("update user set password = #{passWord},name = #{name},phone = #{phone} where username = #{userName}")
    int modify(User user);
}
