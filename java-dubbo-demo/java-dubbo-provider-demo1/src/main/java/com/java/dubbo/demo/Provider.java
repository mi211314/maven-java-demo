package com.java.dubbo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Description: Provider
 * @Author: miaolei
 * @Date: 2019/9/1 21:00
 */
public class Provider {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        context.start();
        // 按任意键退出
        System.in.read();
    }

}
