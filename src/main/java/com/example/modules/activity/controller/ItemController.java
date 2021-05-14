package com.example.modules.activity.controller;

import com.example.modules.activity.entity.Item;
import com.example.modules.activity.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @PostMapping("/select")
    public List<Item> Select(){
        List<Item> list = itemService.getItem();

        return itemService.getItem();
    }

    @PostMapping("/getItem")
    public Item getItem(String itemId){
        return itemService.getItem(itemId);
    }

    @PostMapping("/updateItem")
    public int updateItem(String name,String number,int remain,int price,String belong,String address,String image){
        Item item = new Item(name,number,remain,price,belong,address,image);
        return itemService.updateItem(item);
    }

    @PostMapping("/addItem")
    public int addItem(String name,String number,int remain,int price,String belong,String address,String image){
        Item item = new Item(name,number,remain,price,belong,address,image);
        return itemService.addItem(item);
    }
}
