package com.example.modules.activity.mapper;

import com.example.modules.activity.entity.Activity;
import org.apache.ibatis.annotations.Insert;
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
    @Insert("insert into activity (activityName," +
            "managerName,managerId,address,startTime,endTime,num,maxNum" +
            ",visit,status) values(#{activityName},#{managerName},#{managerId},#{address},#{startTime}" +
            ",#{endTime},#{num},#{maxNum},#{visit},#{status})")
    int addActivity(Activity activity);
}
