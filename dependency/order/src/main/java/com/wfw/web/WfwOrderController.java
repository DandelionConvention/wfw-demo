package com.wfw.web;

import com.wfw.info.OrderInfo;
import com.wfw.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class WfwOrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/add")
    public String addOrder(@RequestBody OrderInfo orderInfo){
        System.out.println(orderInfo.toString());
        int order = orderService.createOrder(orderInfo);
        return String.valueOf(order);
    }
}
