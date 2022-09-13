package com.wfw.web;

import com.wfw.info.OrderInfo;
import com.wfw.webfeign.OrderFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order-api")
public class OrderController {

    @Autowired
    OrderFeignClient orderFeignClient;// 一个接口有多个实现类了，不知道注入哪个？

    @PostMapping("/addOrder")
    public String addOrder(@RequestBody OrderInfo orderInfo){
        // 需要调用另一个服务
//        OrderInfo orderInfo = new OrderInfo();
//        orderInfo.setNumber(number);
        orderInfo.setId((int)(Math.random() * 100));

        System.out.println(orderInfo.toString());

        String res = orderFeignClient.add(orderInfo);

        return res;
    }
}
