package com.zb.service;

import com.zb.entity.Order;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderService {

    private List<Order> list = new ArrayList<>();
    @RequestMapping(value = "/findOrderList/{uid}" ,method = RequestMethod.GET)
    public List<Order> findOrderList(@PathVariable("uid") Integer uid){

        List<Order> list = new ArrayList<>();
        list.add(new Order(1,"食品订单1",110,uid));
        list.add(new Order(2,"食品订单2",120,uid));
        list.add(new Order(3,"食品订单3",130,uid));

        return list;
    }

    @RequestMapping(value = "/addOrder" ,method = RequestMethod.POST)
    public String addOrder(@RequestBody Order order){
        list.add(order);
        return "ok";
    }

}
