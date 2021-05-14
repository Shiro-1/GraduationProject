package com.example.modules.activity.service.impl;

import com.example.modules.activity.entity.Order;
import com.example.modules.activity.mapper.OrderMapper;
import com.example.modules.activity.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper orderMapper;
    @Override
    public List<Order> getAllOrder() {
        return orderMapper.getOrders();
    }

    @Override
    public List<Order> getOrders(int id) {
        return orderMapper.getOrderbyID(id);
    }

    @Override
    public int addOrder(Order order) {
        return orderMapper.addOrder(order);
    }

    @Override
    public Integer getNum(String serial) {
        return orderMapper.getNum(serial);
    }
}
