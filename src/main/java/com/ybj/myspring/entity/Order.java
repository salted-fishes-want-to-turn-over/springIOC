package com.ybj.myspring.entity;

import com.ybj.myspring.Component;
import com.ybj.myspring.Value;
import lombok.Data;

@Data
@Component("myOrder")
public class Order {
    @Value("xxx123")
    private String orderId;
    @Value("1000.5")
    private Float price;
}
