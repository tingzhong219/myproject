package com.zb.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zb.entity.Order;
import com.zb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/show")
//    @HystrixCommand(fallbackMethod = "procc_show")
    public List<Order> show(Integer uid) {
//        if(Math.random()>0.5){
//            throw new RuntimeException("异常！");
//        }
        return userService.findUserOrder(uid);
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(@RequestBody Order order) {
        return userService.userAddOrder(order);
    }

    public List<Order> procc_show(Integer uid){
        Order order=new Order();
        order.setId(1);
        order.setName("异常");
        List<Order> list = new ArrayList<>();
        list.add(order);
        return list;
    }

}
