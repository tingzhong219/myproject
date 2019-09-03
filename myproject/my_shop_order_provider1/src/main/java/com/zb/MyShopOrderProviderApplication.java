package com.zb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//本地新开发的功能
@SpringBootApplication
@EnableDiscoveryClient
public class MyShopOrderProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyShopOrderProviderApplication.class, args);
    }

}
