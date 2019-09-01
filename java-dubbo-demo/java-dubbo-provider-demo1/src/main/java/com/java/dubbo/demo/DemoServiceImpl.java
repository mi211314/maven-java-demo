package com.java.dubbo.demo;

import org.springframework.stereotype.Service;

/**
 * @Description: DemoServiceImpl
 * @Author: miaolei
 * @Date: 2019/9/1 20:11
 */
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

}
