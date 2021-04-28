package com.example.modules.activity.service;

import com.example.modules.activity.entity.Order;

import java.util.List;

public interface OrderService {
    //获取所有的订单数量
    List<Order> getAllOrder();
}
