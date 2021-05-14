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
    @Insert("INSERT INTO `order`(order_detail,order_userId,order_total,order_addtime,order_state,order_client,order_remark,order_io,order_time) VALUES (#{orderDetail}, #{orderUserId}, #{orderTotal}, #{orderAddtime}, #{orderState},#{orderClient},#{orderRemark}, #{orderIO}, #{orderTime})")
    int addOrder(Order order);
    @Select("select count(*) from `order` where order_detail like concat('%',#{serial},'%')")
    Integer getNum(String serial);
}
