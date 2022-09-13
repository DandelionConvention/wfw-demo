package com.wfw.service;

import com.wfw.info.Order;
import com.wfw.info.OrderInfo;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    // service是作为微服务的一个给别人去使用的。orderInfo也是公共的
    public int createOrder(OrderInfo orderInfo){
        // 将公共orderinfo转化为表的order
        Order order = new Order();
        order.setId(orderInfo.getId());
        order.setName(orderInfo.getNumber());
        // 调用dao层保存orderinfo
        try{
            return order.getId();
        }catch (Exception e){
            return -1;
        }

    }
}
