package com.example.modules.activity.service;

import com.example.modules.activity.entity.Order;

import java.util.List;

public interface OrderService {
    //管理员获取所有的订单
    List<Order> getAllOrder();
    //根据用户ID获取申请订单
    List<Order> getOrders(int id);
    //用户申请添加订单
    int addOrder(Order order);
    //获取指定月份订单数量
    Integer getNum(String serial);
}
