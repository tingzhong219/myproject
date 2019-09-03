package com.zb.feign;

import com.zb.entity.Order;
import com.zb.feign.impl.OrderFeignClientImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "order-provider" ,fallback = OrderFeignClientImpl.class)
public interface OrderFeignClient {
    @RequestMapping(value = "/findOrderList/{uid}", method = RequestMethod.GET)
    List<Order> findOrderList(@PathVariable("uid") Integer uid);

    @RequestMapping(value = "/addOrder" ,method = RequestMethod.POST)
    public String addOrder(@RequestBody Order order);
}
