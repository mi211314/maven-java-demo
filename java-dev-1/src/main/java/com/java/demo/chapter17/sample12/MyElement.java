package com.java.demo.chapter17.sample12;

/**
 * @Description: MyElement
 * @Author: miaolei
 * @Date: 2019/6/5 22:29
 */
public class MyElement {

    private String content;

    public MyElement(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "MyElement{" +
                "content='" + content + '\'' +
                '}';
    }

}
