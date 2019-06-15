package com.java.demo.chapter15.sample14;

/**
 * @Description:
 * @Date: 2019/5/3 17:12
 */
public class Student implements Comparable<Student>{

    private String name;

    int age;

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

    @Override
    public int compareTo(Student o) {
        return this.classNum - o.classNum;
    }

}
