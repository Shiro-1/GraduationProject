package com.example.modules.activity.controller;

import com.example.modules.activity.entity.Item;
import com.example.modules.activity.service.ItemService;
import com.example.modules.activity.service.UserService;
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
        return itemService.getItem();
    }
}
