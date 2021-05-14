package com.example.modules.activity.entity;

public class Detail {
    private String detailOrder;
    private String detailItem;
    private int detailNum;

    public Detail() {
    }

    public Detail(String detailOrder, String detailItem, int detailNum) {
        this.detailOrder = detailOrder;
        this.detailItem = detailItem;
        this.detailNum = detailNum;
    }

    public String getDetailOrder() {
        return detailOrder;
    }

    public void setDetailOrder(String detailOrder) {
        this.detailOrder = detailOrder;
    }

    public String getDetailItem() {
        return detailItem;
    }

    public void setDetailItem(String detailItem) {
        this.detailItem = detailItem;
    }

    public int getDetailNum() {
        return detailNum;
    }

    public void setDetailNum(int detailNum) {
        this.detailNum = detailNum;
    }
}
