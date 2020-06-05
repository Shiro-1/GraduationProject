package com.example.modules.activity.entity;

public class Attention {
    public String code;
    public String words;

    public Attention() {
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public void setState(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
