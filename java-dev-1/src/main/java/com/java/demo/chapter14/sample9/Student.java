package com.java.demo.chapter14.sample9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

/**
 * @Description: Student
 * @Date: 2019/4/22 07:54
 */
public class Student {

    private static final Logger logger = LoggerFactory.getLogger(Student.class);

    private String name;

    public Student() {

    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
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
        logger.info("调用了{}的equals方法，与{}比", this.name, student.name);
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        int hashCode = Objects.hash(name);
        logger.info("调用了{}的hashCode方法，哈希码为：{}！！！", this.name, hashCode);
        return hashCode;
    }

}
