package com.example.modules.activity.controller;

import com.example.modules.activity.entity.Detail;
import com.example.modules.activity.entity.Item;
import com.example.modules.activity.service.DetailService;
import com.example.modules.activity.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/detail")
public class DetialController {
    @Autowired
    private DetailService detailService;
    @Autowired
    private ItemService itemService;

    @PostMapping("/select")
    public List<Item> Select(String orderNum){
        List<Detail> details = detailService.getItemDetail(orderNum);
        List<Item> items = new ArrayList<Item>();
        for(Detail d : details){
            Item item = itemService.getItem(d.getDetailItem());
            item.setItemApply(d.getDetailNum());
            items.add(item);
        }
        return items;
    }
}
