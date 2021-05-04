package com.example.modules.activity.mapper;

import com.example.modules.activity.entity.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderMapper {
    @Select("select * from `order`")
    List<Order> getOrders();
    @Select("select * from `order` where order_userId = #{id}")
    List<Order> getOrderbyID(int id);
    @Insert("INSERT INTO `order`(order_userId,order_itemId,order_num,order_time,order_state,order_io) VALUES (#{orderUserId}, #{orderItemId}, #{orderNum}, #{orderTime}, #{orderState}, #{orderIO})")
    int addOrder(Order order);
}
