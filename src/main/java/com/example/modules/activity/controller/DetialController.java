package com.example.modules.activity.controller;

import com.example.modules.activity.entity.Detail;
import com.example.modules.activity.service.DetailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/detail")
public class DetialController {
    @Autowired
    private DetailService detailService;

    @PostMapping("/select")
    public List<Detail> Select(String orderNum){
        return detailService.getItemDetail(orderNum);
    }
}
