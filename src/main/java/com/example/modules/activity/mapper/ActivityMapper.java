package com.example.modules.activity.mapper;

import com.example.modules.activity.entity.Activity;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityMapper {
    @Select("select * from activity")
    List<Activity> getActivity();
    @Update("update activity set ")
    int modifyActivity(Activity activity);
}
