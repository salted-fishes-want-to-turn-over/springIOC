package com.ybj.myspring.entity;

import com.ybj.myspring.Autowired;
import com.ybj.myspring.Component;
import com.ybj.myspring.Qualifier;
import com.ybj.myspring.Value;
import lombok.Data;

@Data
@Component
public class Account {
    @Value("1")
    private Integer id;
    @Value("张三")
    private String name;
    @Value("22")
    private Integer age;
    @Autowired
    @Qualifier("myOrder")
    private Order order;
}
