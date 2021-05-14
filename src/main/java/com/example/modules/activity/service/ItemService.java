package com.example.modules.activity.service;
import com.example.modules.activity.entity.Item;

import java.util.List;

public interface ItemService {
    //获取物料清单
    List<Item> getItem();
    //根据ID获取对应物料信息
    Item getItem(String id);
    //根据ID修改对应物料信息
    int updateItem(Item item);
    //新物料入库
    int addItem(Item item);
}
