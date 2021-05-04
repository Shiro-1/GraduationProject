package com.example.modules.activity.tools;

import net.sf.json.JSONObject;

public class tools{
    //对于泛型对象的JSON转换
    public static  <T> String toJson(T t)
    {
        JSONObject json = JSONObject.fromObject(t);
        return json.toString();
    }
}
