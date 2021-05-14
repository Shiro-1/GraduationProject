package com.example.modules.activity.controller;


import com.example.modules.activity.entity.Detail;
import com.example.modules.activity.entity.Item;
import com.example.modules.activity.entity.Order;
import com.example.modules.activity.service.DetailService;
import com.example.modules.activity.service.ItemService;
import com.example.modules.activity.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private DetailService detailService;

    @PostMapping("/test")
    public int Test(String item){
        return 1;
    }

    @PostMapping("/select")
    public List<Order> Select(){
        List<Order> list = orderService.getAllOrder();
        for (Order order:list) {
            String data = order.getOrderAddtime().split(" ")[0];
            order.setOrderAddtime(data);
            System.out.printf(order.getOrderTime());
        }
        return list;
    }
    @PostMapping("/getOrders")
    public List<Order> getOrders(int userId){
        List<Order> list = orderService.getOrders(userId);
        for (Order order:list) {
            System.out.printf(order.getOrderTime());
        }
        return list;
    }
    @PostMapping("/addOrder")
    public int addOrder(String addTime,int outIn,int userId,int total,String client,String remark,String item){
        Date date=new Date();
        //DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //System.out.printf(format.format(date));
        String data = format.format(date);
        String inout = "";
        if(outIn == 1){
            inout = "RKD";
        }else{
            inout = "CKD";
        }
        String time = inout+"-"+addTime.split("-")[0]+addTime.split("-")[1];
        String da = "HN-"+time+String.format("%04d",orderService.getNum(time)+1);
        Order order = new Order(da,userId,total,addTime,1,client,remark,outIn,data);
        int isSave = orderService.addOrder(order);
        if(isSave>0){
            JSONArray jsonArray = JSONArray.fromObject(item);
            String vouchersListJson = jsonArray.toString();
            if(null != vouchersListJson){
                JSONArray jsonArray1 = JSONArray.fromObject(vouchersListJson);
                //循环获取json数组中的 json 对象，然后转换为 object
                for (int j = 0; j < jsonArray1.size(); j++) {
                    JSONObject jsonObject2 = jsonArray1.getJSONObject(j);
                    Detail detail = new Detail(da,jsonObject2.getString("number"),Integer.parseInt(jsonObject2.getString("num")));
                    int i = detailService.saveItemDetail(detail);
                }
            }
        }
//        if(isSave>0){
//            Item item = itemService.getItem(order_itemId);
//            int num = item.getItemRemain();
//            if(order_io == 0){
//                if(order_num>num){
//                    return -1;
//                }
//                num-=order_num;
//                item.setItemRemain(num);
//            }else {
//                num+=order_num;
//                item.setItemRemain(num);
//            }
//            itemService.updateItem(item);
//        }
        return isSave;
    }

    @PostMapping("/updateItem")
    public int updateItem(){

        return 0;
    }
}
