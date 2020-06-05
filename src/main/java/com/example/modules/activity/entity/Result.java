package com.example.modules.activity.entity;

public class Result<T> extends Attention {
    private T object;

    public Result() {
    }

    public Result(T object,String state,String words) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }
    public void setState(String code) {
        super.code = code;
    }
    public void setWords(String words) {
        super.words = words;
    }
    public void setObject(T t){
        this.object = t;
    }
}
