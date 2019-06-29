package com.java.demo.chapter29.sample6;

import java.io.Serializable;

/**
 * @Description: Employee
 * @Author: miaolei
 * @Date: 2019/6/28 21:41
 */
public class Employee implements Serializable {

    private String name;

    private int age;

    public Employee() {

    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
