package com.java.dubbo.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description: Consumer
 * @Author: miaolei
 * @Date: 2019/9/1 21:30
 */
@Slf4j
public class Consumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        // 获取远程服务代理
        DemoService demoService = (DemoService)context.getBean("demoService");
        // 执行远程方法
        String hello = demoService.sayHello("world");
        // 显示调用结果
        log.info("result={}", hello);
    }

}
