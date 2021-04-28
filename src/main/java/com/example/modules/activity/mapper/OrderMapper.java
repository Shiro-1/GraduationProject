package com.example.modules.activity.mapper;

import com.example.modules.activity.entity.Order;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderMapper {
    @Select("select * from `order`")
    List<Order> getOrders();
}
