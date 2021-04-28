package com.example.modules.activity.controller;


import com.example.modules.activity.entity.Order;
import com.example.modules.activity.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Timer;

@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping("/select")
    public List<Order> Select(){
        List<Order> list = orderService.getAllOrder();
        for (Order order:list) {
            System.out.printf(order.getOrderTime());
        }
        return list;
    }
}
