package com.java.demo.chapter14.sample13;

/**
 * @Description:
 * @Date: 2019/4/23 07:40
 */
public class Student implements Comparable<Student> {

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
