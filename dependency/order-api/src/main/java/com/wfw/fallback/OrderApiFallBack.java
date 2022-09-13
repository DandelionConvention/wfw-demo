package com.wfw.fallback;

import com.wfw.info.OrderInfo;
import com.wfw.webfeign.OrderFeignClient;
import org.springframework.stereotype.Component;

@Component
public class OrderApiFallBack implements OrderFeignClient {

    // 如果这个需要执行，就会执行这个同名方法
    @Override
    public String add(OrderInfo orderInfo) {
        return "服务崩了，还刷呢？？？？";
    }
}
