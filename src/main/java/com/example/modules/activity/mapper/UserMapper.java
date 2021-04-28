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
    @Select("select * from user where user_account = #{username}")
    User getUser(String username);
    @Insert("insert into user (user_account,user_password,user_level,user_name,user_phone,user_partment,user_state) values (#{userAccount},#{userPassword},#{userLevel},#{userName},#{userPhone},#{userPartment},#{userState})")
    int Register(User user);
    @Update("update user set user_password = #{userPassword},user_name = #{userName},user_phone = #{userPhone},user_state = #{userState},user_level = #{userLevel},user_partment = #{userPartment} where user_account = #{userAccount}")
    int modify(User user);
}
