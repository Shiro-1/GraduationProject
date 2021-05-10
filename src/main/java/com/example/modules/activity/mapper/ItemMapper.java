package com.example.modules.activity.mapper;

import com.example.modules.activity.entity.Activity;
import com.example.modules.activity.entity.Item;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemMapper {
    @Select("select * from item")
    List<Item> getItems();
    @Select("select * from item where item_id = #{id}")
    Item getItem(int id);
    @Update("update item set item_remain = #{itemRemain} where item_number = #{itemNumber};")
    int addItem(Item item);
}
