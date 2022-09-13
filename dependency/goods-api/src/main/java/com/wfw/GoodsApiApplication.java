package com.wfw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//@EnableDiscoveryClient // 代表当前这个服务是一个服务的消费者，调用别的服务
@EnableFeignClients
public class GoodsApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(GoodsApiApplication.class,args);
    }
}
