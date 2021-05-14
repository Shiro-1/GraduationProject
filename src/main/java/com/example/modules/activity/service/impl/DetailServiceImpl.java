package com.example.modules.activity.service.impl;

import com.example.modules.activity.entity.Detail;
import com.example.modules.activity.mapper.DetailMapper;
import com.example.modules.activity.service.DetailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
public class DetailServiceImpl implements DetailService {
    @Autowired
    DetailMapper detailMapper;

    @Override
    public List<Detail> getItemDetail(String id) {
        return detailMapper.getDetails(id);
    }

    @Override
    public int saveItemDetail(Detail detail) {
        return detailMapper.addDetails(detail);
    }
}
