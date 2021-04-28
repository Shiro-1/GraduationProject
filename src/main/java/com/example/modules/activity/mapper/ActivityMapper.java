package com.example.modules.activity.mapper;

import com.example.modules.activity.entity.Activity;
import com.example.modules.activity.entity.Attend;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityMapper {
    @Select("select * from activity")
    List<Activity> getActivity();
    @Update("update activity set activityName = #{activityName},managerName = #{managerName}" +
            ",managerId = #{managerId},address = #{address},startTime = #{startTime}" +
            ",endTime = #{endTime},num = #{num},maxNum = #{maxNum},visit = #{visit}" +
            ",status = #{status} where id = #{id}")
    int modifyActivity(Activity activity);
    @Insert("insert into activity (activityName," +
            "managerName,managerId,address,startTime,endTime,num,maxNum" +
            ",visit,status) values(#{activityName},#{managerName},#{managerId},#{address},#{startTime}" +
            ",#{endTime},#{num},#{maxNum},#{visit},#{status})")
    int addActivity(Activity activity);
    @Select("select * from activity where id =#{id}")
    Activity get(String id);
    @Insert("insert into participate (user_id," +
            "activity_id,status) values(#{userId},#{activityId},1)")
    int addJoin(String userId,String activityId);
    @Select("select * from participate where user_id = #{userId}")
    List<Attend> getAttention(String userId);
}
