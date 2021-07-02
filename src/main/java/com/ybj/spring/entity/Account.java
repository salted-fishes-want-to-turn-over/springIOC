package com.ybj.spring.entity;

import com.ybj.myspring.Autowired;
import com.ybj.myspring.Component;
import com.ybj.myspring.Qualifier;
import com.ybj.myspring.Value;
import lombok.Data;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;

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
    private Order myOrder;
}
