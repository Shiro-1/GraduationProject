package com.example.modules.activity.service;

import com.example.modules.activity.entity.Activity;
import com.example.modules.activity.entity.Attend;
import com.example.modules.activity.entity.Attention;

import java.util.List;

public interface ActivityService {
    int addActivity(Activity activity);
    int ModifyActivity(Activity activity);
    Activity get(String id);
    List<Activity> getActivity();
    int JoinActivity(String userId,String activityId);
    List<Attend> getAttention(String userId);
}
