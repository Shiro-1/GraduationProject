package com.example.modules.activity.entity;

public class Item {
    private String itemName;
    private String itemNumber;
    private int itemRemain;
    private int itemApply;
    private int itemPrice;
    private String itemBelong;
    private String itemAddress;
    private String itemImage;

    public Item() {
    }

    public Item(String itemName, String itemNumber, int itemRemain, int itemApply, int itemPrice, String itemBelong, String itemAddress, String itemImage) {
        this.itemName = itemName;
        this.itemNumber = itemNumber;
        this.itemRemain = itemRemain;
        this.itemApply = itemApply;
        this.itemPrice = itemPrice;
        this.itemBelong = itemBelong;
        this.itemAddress = itemAddress;
        this.itemImage = itemImage;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public int getItemRemain() {
        return itemRemain;
    }

    public void setItemRemain(int itemRemain) {
        this.itemRemain = itemRemain;
    }

    public int getItemApply() {
        return itemApply;
    }

    public void setItemApply(int itemApply) {
        this.itemApply = itemApply;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemBelong() {
        return itemBelong;
    }

    public void setItemBelong(String itemBelong) {
        this.itemBelong = itemBelong;
    }

    public String getItemAddress() {
        return itemAddress;
    }

    public void setItemAddress(String itemAddress) {
        this.itemAddress = itemAddress;
    }

    public String getItemImage() {
        return itemImage;
    }

    public void setItemImage(String itemImage) {
        this.itemImage = itemImage;
    }
}
