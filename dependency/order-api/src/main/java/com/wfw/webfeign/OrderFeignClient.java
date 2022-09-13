package com.wfw.webfeign;

import com.wfw.fallback.OrderApiFallBack;
import com.wfw.info.OrderInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "order",fallback = OrderApiFallBack.class)
public interface OrderFeignClient {
    @PostMapping("/order/add")
    public String add(OrderInfo orderInfo);
}
