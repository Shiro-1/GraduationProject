package com.example.modules.activity.controller;


import com.example.modules.activity.entity.Order;
import com.example.modules.activity.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    @PostMapping("/getOrders")
    public List<Order> getOrders(int userId){
        List<Order> list = orderService.getOrders(userId);
        for (Order order:list) {
            System.out.printf(order.getOrderTime());
        }
        return list;
    }
    @PostMapping("/addOrder")
    public int addOrder(int order_userId,int order_itemId,int order_num,int order_io){
        Date date=new Date();
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String da = format.format(date).toString();
        //System.out.printf(da);
        Order order = new Order(order_userId,order_itemId,order_num,format.format(date).toString(),1,order_io);
        int isSave = orderService.addOrder(order);
        return isSave;
    }
}
