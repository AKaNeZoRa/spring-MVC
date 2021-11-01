package com.xxx.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.xxx.Utils.JsonUtils;
import com.xxx.pojo.user;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Controller
@RestController
public class controllertest {
    @RequestMapping("/josn1")
    //@ResponseBody
public String joson1() throws JsonProcessingException {
    ObjectMapper om = new ObjectMapper();
    user user = new user("张飞", 3, "男");

        String str;
        return str = om.writeValueAsString(user) ;
}
@RequestMapping("josn2")
public String josn2() throws JsonProcessingException {
    ObjectMapper om = new ObjectMapper();
    user user = new user("张飞", 3, "男");
    user user2 = new user("张飞1", 3, "男");
    user user3 = new user("张飞2", 3, "男");
    user user4 = new user("张飞3", 3, "男");
    List<user> list = new ArrayList<user>();
    list.add(user);
    list.add(user2);
    list.add(user3);
    list.add(user4);
    String str = om.writeValueAsString(list);
    return str;
}
@RequestMapping("/josn3")
public String josn3() throws JsonProcessingException {
    ObjectMapper om = new ObjectMapper();
    Date date = new Date();
    String str = om.writeValueAsString(date);
    return str;
}
    @RequestMapping("/josn4")
    public String josn4() throws JsonProcessingException {
        ObjectMapper om = new ObjectMapper();
        //不使用时间戳的方式
        om.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        //自定义日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //指定日期格式
        om.setDateFormat(sdf);
        Date date = new Date();
        String str = om.writeValueAsString(date);
        return str;
    }

    @RequestMapping("/josn5")
    public String josn5() throws JsonProcessingException {
        Date date = new Date();
        String json = JsonUtils.getJson(date);
        return json;
    }
}
