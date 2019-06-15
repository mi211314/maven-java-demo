package com.java.demo.chapter14.sample1;

/**
 * @Description: Student
 *
 * @Date: 2019/4/14 15:01
 */
public class Student {

    private String name;

    private int age;

    private int classNum;

    public Student() {

    }

    public Student(String name, int age, int classNum) {
        this.name = name;
        this.age = age;
        this.classNum = classNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", classNum=" + classNum +
                '}';
    }

}
