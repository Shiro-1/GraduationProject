package com.example.modules.activity.mapper;

import com.example.modules.activity.entity.Activity;
import com.example.modules.activity.entity.Item;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemMapper {
    @Select("select * from item")
    List<Item> getItem();
}
