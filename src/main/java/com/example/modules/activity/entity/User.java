package com.example.modules.activity.entity;


public class User {
    private int userId;
    private String userAccount;
    private String userPassword;
    private int userLevel;
    private String userName;
    private String userPhone;
    private String userPartment;
    private int userState;

    public User() {
    }

    public User(String userAccount, String userPassword, int userLevel, String userName, String userPhone, String userPartment, int userState) {
        this.userAccount = userAccount;
        this.userPassword = userPassword;
        this.userLevel = userLevel;
        this.userName = userName;
        this.userPhone = userPhone;
        this.userPartment = userPartment;
        this.userState = userState;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(int userLevel) {
        this.userLevel = userLevel;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserPartment() {
        return userPartment;
    }

    public void setUserPartment(String userPartment) {
        this.userPartment = userPartment;
    }

    public int getUserState() {
        return userState;
    }

    public void setUserState(int userState) {
        this.userState = userState;
    }
}
