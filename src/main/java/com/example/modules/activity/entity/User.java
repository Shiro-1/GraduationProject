package com.example.modules.activity.entity;


public class User {
    private int id;
    private String userName;
    private String passWord;
    private int rank;
    private String name;
    private String phone;
    private String title;
    private int state;
    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", rank=" + rank +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", title='" + title + '\'' +
                ", state=" + state +
                '}';
    }

    public User(int id ,String userName, String passWord, int rank, String name, String phone, String title, int state) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.rank = rank;
        this.name = name;
        this.phone = phone;
        this.title = title;
        this.state = state;
    }

    public User(String userName, String passWord, int rank, String name, String phone, String title, int state) {
        this.userName = userName;
        this.passWord = passWord;
        this.rank = rank;
        this.name = name;
        this.phone = phone;
        this.title = title;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
