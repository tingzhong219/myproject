package com.zb.service.impl;

import com.zb.entity.Order;
import com.zb.feign.OrderFeignClient;
import com.zb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private OrderFeignClient orderFeignClient;

    @Override
    public List<Order> findUserOrder(Integer uid) {
        return orderFeignClient.findOrderList(uid);
    }

    @Override
    public String userAddOrder(Order order) {
        return orderFeignClient.addOrder(order);
    }
}
