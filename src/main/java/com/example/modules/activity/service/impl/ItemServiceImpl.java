package com.example.modules.activity.service.impl;

import com.example.modules.activity.entity.Item;
import com.example.modules.activity.mapper.ItemMapper;
import com.example.modules.activity.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemMapper itemMapper;

    @Override
    public List<Item> getItem() {
        return itemMapper.getItems();
    }

    @Override
    public Item getItem(String id) {
        return itemMapper.getItem(id);
    }

    @Override
    public int updateItem(Item item) {
        return itemMapper.updateItem(item);
    }

    @Override
    public int addItem(Item item) {
        return itemMapper.addItem(item);
    }

}
