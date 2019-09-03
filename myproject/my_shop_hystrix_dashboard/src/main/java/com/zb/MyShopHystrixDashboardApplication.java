package com.zb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class MyShopHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyShopHystrixDashboardApplication.class, args);
    }

}
