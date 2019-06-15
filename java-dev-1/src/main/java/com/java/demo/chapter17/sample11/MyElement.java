package com.java.demo.chapter17.sample11;

import java.util.Objects;

/**
 * @Description: MyElement
 * @Author: miaolei
 * @Date: 2019/6/4 07:37
 */
public class MyElement implements Comparable<MyElement> {

    public int priority;

    private String content;

    public MyElement() {
    }

    public MyElement(Integer priority, String content) {
        this.priority = priority;
        this.content = content;
    }

    @Override
    public int compareTo(MyElement o) {
        return this.priority - o.priority;
    }

    @Override
    public String toString() {
        return "MyElement{" +
                "priority=" + priority +
                ", content='" + content + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyElement myElement = (MyElement) o;
        return priority == myElement.priority &&
                Objects.equals(content, myElement.content);
    }

    @Override
    public int hashCode() {

        return Objects.hash(priority, content);
    }

}
