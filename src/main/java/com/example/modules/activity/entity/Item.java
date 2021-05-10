package com.example.modules.activity.entity;

public class Item {
    private String itemName;
    private int itemRemain;
    private int itemPrice;
    private String itemBelong;
    private String itemSupplier;
    private String itemAddress;
    private String itemNumber;
    private String itemImage;

    public Item() {
    }

    public Item(String itemName, int itemRemain, int itemPrice, String itemBelong, String itemSupplier, String itemAddress, String itemNumber, String itemImage) {
        this.itemName = itemName;
        this.itemRemain = itemRemain;
        this.itemPrice = itemPrice;
        this.itemBelong = itemBelong;
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

    public int getItemRemain() {
        return itemRemain;
    }

    public void setItemRemain(int itemRemain) {
        this.itemRemain = itemRemain;
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

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getItemImage() {
        return itemImage;
    }

    public void setItemImage(String itemImage) {
        this.itemImage = itemImage;
    }
}
