package com.example.modules.activity.service;

import com.example.modules.activity.entity.Activity;

import java.util.List;

public interface ActivityService {
    int addActivity(Activity activity);
    int ModifyActivity(Activity activity);
    List<Activity> getActivity();

}
