package com.example.modules.activity.controller;

import com.example.modules.activity.entity.Activity;
import com.example.modules.activity.entity.Attend;
import com.example.modules.activity.entity.Attention;
import com.example.modules.activity.entity.Result;
import com.example.modules.activity.service.ActivityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.modules.activity.tools.tools;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/activity")
public class ActivityController {
    @Autowired
    ActivityService activityService;

    @PostMapping("/select")
    public List<Activity> Select(){
        List<Activity> Activities = activityService.getActivity();
        return Activities;
    }
    @PostMapping("/add")
    public Result<Activity> Add(String activity_name,String manager_name,int manager_id,String address
            ,String start_time,String end_time,int max_num,int status){
        Activity activity = new Activity(activity_name,manager_name,manager_id,address,start_time,end_time,0,
                max_num,0,status);
        int num = activityService.addActivity(activity);
        Result<Activity> result = new Result<>();
        if(num==1){
            result.setObject(activity);
            result.setState("0000");
            result.setWords("添加活动列表成功！");
            return result;
        }
        result.setState("1000");
        result.setWords("添加活动失败！");
        return result;
    }
    @PostMapping("/join")
    public String Join(String userId,String activityId){
        Activity activity = activityService.get(activityId);
        Result<String> result = new Result<>();
        if(activity==null){
            result.setState("1003");
            result.setWords("未找到所要参加的活动！");
            return tools.toJson(result);
        }
        try{
            if(activity.getNum()<activity.getMaxNum()){
                activity.setNum(activity.getNum()+1);
                int j = activityService.JoinActivity(userId,activityId);
                int i = activityService.ModifyActivity(activity);
                if(i==1&&j==1){
                    result.setState("0000");
                    result.setWords("参与活动成功！");
                    return tools.toJson(result);
                }else{
                    result.setState("1002");
                    result.setWords("添加参与者信息失败！");
                    return tools.toJson(result);
                }
            }else{
                result.setState("1001");
                result.setWords("参与人数达到上线！");
                return tools.toJson(result);
            }
        }catch (Exception e){
            result.setState("1000");
            result.setWords("参与活动失败！原因是："+e.getMessage());
            return tools.toJson(result);
        }
    }
    @PostMapping("/activities")
    public List<Activity> activities(String userId){
        List<Attend> list = activityService.getAttention(userId);
        List<Activity> activities = new ArrayList<>();
        for(Attend attend : list){
            Activity activity = activityService.get(attend.getActivityId());
            activities.add(activity);
        }
        return activities;
    }
    @PostMapping("/test")
    public List<Activity> Test(String userId){
        return null;
    }
}
