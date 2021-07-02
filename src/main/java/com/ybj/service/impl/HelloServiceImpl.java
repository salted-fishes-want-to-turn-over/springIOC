package com.ybj.service.impl;

import com.ybj.dao.HelloDao;
import com.ybj.factory.BeanFactory;
import com.ybj.service.HelloService;

import java.util.List;

public class HelloServiceImpl implements HelloService {

    public HelloServiceImpl() {
        for (int i = 0; i < 10; i++) {
            System.out.println(BeanFactory.getDao("helloDao"));
        }
    }

    private HelloDao helloDao = (HelloDao) BeanFactory.getDao("helloDao");

    @Override
    public List<String> findAll() {
        return this.helloDao.findAll();
    }
}
