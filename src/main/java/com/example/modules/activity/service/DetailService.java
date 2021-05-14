package com.example.modules.activity.service;

import com.example.modules.activity.entity.Detail;

import java.util.List;

public interface DetailService {
    //根据单号获取物料信息
    List<Detail> getItemDetail(String id);
    //保存物料单号
    int saveItemDetail(Detail detial);
}
