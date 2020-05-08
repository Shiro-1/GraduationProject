package com.example.modules.activity.entity;

public class Result<T> {
    private T object;
    private String state;
    private String words;

    public Result() {
    }

    public Result(T object) {
        this.object = object;
    }

    public void setObject(T t){
        this.object = t;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }
}
