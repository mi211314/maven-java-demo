package com.java.demo.chapter14.sample3;

import java.util.Objects;

/**
 * @Description: Student
 * @Author:
 * @Date: 2019/4/14 22:02
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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return age == student.age &&
                classNum == student.classNum &&
                name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return 7 * this.name.hashCode() +
                13 * Integer.valueOf(this.age).hashCode() +
                17 * Integer.valueOf(this.classNum).hashCode();
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

