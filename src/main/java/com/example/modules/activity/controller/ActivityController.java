package com.example.modules.activity.controller;

import com.example.modules.activity.entity.Activity;
import com.example.modules.activity.entity.Result;
import com.example.modules.activity.service.ActivityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
