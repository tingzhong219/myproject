package com.zb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//xxxxxx
@SpringBootApplication
@EnableEurekaServer
public class MyShopServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyShopServerApplication.class, args);
    }

}//

