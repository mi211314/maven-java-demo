package com.java.demo.chapter29.sample7;

import java.io.Serializable;

/**
 * @Description: Person
 * @Author: miaolei
 * @Date: 2019/6/29 21:22
 */
public class Person implements Serializable {

    private static final long serialVersionUID = -6387317309144841285L;

    private String name;

    private int age;

    public Person() {

    }

    public Person(String name, int age) {
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
