package com.java.demo.chapter14.sample14;

/**
 * @Description: Student
 * @Date: 2019/4/29 07:07
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

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setClassNum(int classNum) {
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
