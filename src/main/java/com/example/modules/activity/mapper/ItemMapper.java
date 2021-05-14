package com.example.modules.activity.mapper;

import com.example.modules.activity.entity.Item;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemMapper {
    @Select("select * from item")
    List<Item> getItems();
    @Select("select * from item where item_number = #{id}")
    Item getItem(String id);
    @Update("update item set item_remain = #{itemRemain},item_name = #{itemName},item_price = #{itemPrice}" +
            ",item_belong = #{itemBelong},item_address = #{itemAddress},item_image = #{itemImage} where item_number = #{itemNumber};")
    int updateItem(Item item);
    @Insert("insert into item(item_name,item_number,item_remain,item_price,item_belong,item_address,item_image) values (#{itemName},#{itemNumber},#{itemRemain},#{itemPrice},#{itemBelong},#{itemAddress},#{itemImage}) ")
    int addItem(Item item);
}
