package com.example.modules.activity.entity;

public class Order {
    private String orderDetail;
    private int orderUserId;
    private int orderTotal;
    private String orderAddtime;
    private int orderState;
    private String orderClient;
    private String orderRemark;
    private int orderIO;
    private String orderTime;

    public Order() {
    }

    public Order(String orderDetail, int orderUserId, int orderTotal, String orderAddtime, int orderState, String orderClient, String orderRemark, int orderIO, String orderTime) {
        this.orderDetail = orderDetail;
        this.orderUserId = orderUserId;
        this.orderTotal = orderTotal;
        this.orderAddtime = orderAddtime;
        this.orderState = orderState;
        this.orderClient = orderClient;
        this.orderRemark = orderRemark;
        this.orderIO = orderIO;
        this.orderTime = orderTime;
    }

    public String getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(String orderDetail) {
        this.orderDetail = orderDetail;
    }

    public int getOrderUserId() {
        return orderUserId;
    }

    public void setOrderUserId(int orderUserId) {
        this.orderUserId = orderUserId;
    }

    public int getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(int orderTotal) {
        this.orderTotal = orderTotal;
    }

    public String getOrderAddtime() {
        return orderAddtime;
    }

    public void setOrderAddtime(String orderAddtime) {
        this.orderAddtime = orderAddtime;
    }

    public int getOrderState() {
        return orderState;
    }

    public void setOrderState(int orderState) {
        this.orderState = orderState;
    }

    public String getOrderClient() {
        return orderClient;
    }

    public void setOrderClient(String orderClient) {
        this.orderClient = orderClient;
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark;
    }

    public int getOrderIO() {
        return orderIO;
    }

    public void setOrderIO(int orderIO) {
        this.orderIO = orderIO;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }
}
