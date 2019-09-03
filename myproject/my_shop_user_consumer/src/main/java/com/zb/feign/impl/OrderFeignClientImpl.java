package com.zb.feign.impl;

import com.zb.entity.Order;
import com.zb.feign.OrderFeignClient;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderFeignClientImpl implements OrderFeignClient {

    @Override
    public List<Order> findOrderList(Integer uid) {
        Order order=new Order();
        order.setId(1);
        order.setName("异常");
        List<Order> list = new ArrayList<>();
        list.add(order);
        return list;
    }

    @Override
    public String addOrder(Order order) {
        return "异常";
    }
}
