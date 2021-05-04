package com.example.modules.activity.service;

import com.example.modules.activity.entity.Activity;
import com.example.modules.activity.entity.Item;

import java.util.List;

public interface ItemService {
    //获取物料清单
    List<Item> getItem();
}
