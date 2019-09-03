package com.zb.service;

import com.zb.entity.Order;

import java.util.List;

public interface UserService {
    public List<Order> findUserOrder(Integer uid);

    public String userAddOrder(Order order);
}
