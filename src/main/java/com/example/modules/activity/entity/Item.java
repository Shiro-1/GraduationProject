package com.example.modules.activity.entity;

public class Item {
    private String itemName;
    private String itemBelong;
    private int itemNum;
    private int itemRemain;
    private String itemSupplier;
    private String itemAddress;
    private int itemNumber;
    private String itemImage;

    public Item() {
    }

    public Item(String itemName, String itemBelong, int itemNum, int itemRemain, String itemSupplier, String itemAddress, int itemNumber, String itemImage) {
        this.itemName = itemName;
        this.itemBelong = itemBelong;
        this.itemNum = itemNum;
        this.itemRemain = itemRemain;
        this.itemSupplier = itemSupplier;
        this.itemAddress = itemAddress;
        this.itemNumber = itemNumber;
        this.itemImage = itemImage;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemBelong() {
        return itemBelong;
    }

    public void setItemBelong(String itemBelong) {
        this.itemBelong = itemBelong;
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

    public String getItemSupplier() {
        return itemSupplier;
    }

    public void setItemSupplier(String itemSupplier) {
        this.itemSupplier = itemSupplier;
    }

    public String getItemAddress() {
        return itemAddress;
    }

    public void setItemAddress(String itemAddress) {
        this.itemAddress = itemAddress;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getItemImage() {
        return itemImage;
    }

    public void setItemImage(String itemImage) {
        this.itemImage = itemImage;
    }
}
