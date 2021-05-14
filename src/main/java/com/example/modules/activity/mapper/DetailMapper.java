package com.example.modules.activity.mapper;

import com.example.modules.activity.entity.Detail;
import com.example.modules.activity.entity.Item;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetailMapper {
    @Select("select * from detail where detail_order = #{id}")
    List<Detail> getDetails(String id);
    @Insert("insert into detail (detail_order,detail_item,detail_num) values (#{detailOrder},#{detailItem},#{detailNum})")
    int addDetails(Detail detail);
}
