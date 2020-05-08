package com.example.modules.activity.service.impl;

import com.example.modules.activity.entity.Activity;
import com.example.modules.activity.mapper.ActivityMapper;
import com.example.modules.activity.service.ActivityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    ActivityMapper activityMapper;
    @Override
    public int addActivity(Activity activity) {
        return activityMapper.addActivity(activity);
    }
    @Override
    public int ModifyActivity(Activity activity) {
        return 0;
    }
    @Override
    public List<Activity> getActivity(){
        return activityMapper.getActivity();
    }
}
