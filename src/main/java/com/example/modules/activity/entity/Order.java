package com.example.modules.activity.entity;

import java.sql.Timestamp;

public class Order {
    private int orderUserId;
    private int orderItemId;
    private int orderNum;
    private String orderTime;
    private int orderState;
    private int orderIO;

    public Order() {
    }

    public Order(int orderUserId, int orderItemId, int orderNum, String orderTime, int orderState, int orderIO) {
        this.orderUserId = orderUserId;
        this.orderItemId = orderItemId;
        this.orderNum = orderNum;
        this.orderTime = orderTime;
        this.orderState = orderState;
        this.orderIO = orderIO;
    }

    public int getOrderUserId() {
        return orderUserId;
    }

    public void setOrderUserId(int orderUserId) {
        this.orderUserId = orderUserId;
    }

    public int getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(int orderItemId) {
        this.orderItemId = orderItemId;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public int getOrderState() {
        return orderState;
    }

    public void setOrderState(int orderState) {
        this.orderState = orderState;
    }

    public int getOrderIO() {
        return orderIO;
    }

    public void setOrderIO(int orderIO) {
        this.orderIO = orderIO;
    }
}
