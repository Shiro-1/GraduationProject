package com.example.modules.activity.entity;

public class Item {
    int itemNum;
    int itemRemain;
    int itemSupplier;
    int itemAddress;

    public Item() {
    }

    public Item(int itemNum, int itemRemain, int itemSupplier, int itemAddress) {
        this.itemNum = itemNum;
        this.itemRemain = itemRemain;
        this.itemSupplier = itemSupplier;
        this.itemAddress = itemAddress;
    }

    public int getItemNum() {
        return itemNum;
    }

    public void setItemNum(int itemNum) {
        this.itemNum = itemNum;
    }

    public int getItemRemain() {
        return itemRemain;
    }

    public void setItemRemain(int itemRemain) {
        this.itemRemain = itemRemain;
    }

    public int getItemSupplier() {
        return itemSupplier;
    }

    public void setItemSupplier(int itemSupplier) {
        this.itemSupplier = itemSupplier;
    }

    public int getItemAddress() {
        return itemAddress;
    }

    public void setItemAddress(int itemAddress) {
        this.itemAddress = itemAddress;
    }
}
