package com.ybj.spring.test;

//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ybj.myspring.MyAnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        //加载IoC容器
        MyAnnotationConfigApplicationContext applicationContext = new MyAnnotationConfigApplicationContext("com.ybj.spring.entity");
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println(applicationContext.getBeanDefinitionCount());
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
            System.out.println(applicationContext.getBean(beanDefinitionName));
        }
    }
}
