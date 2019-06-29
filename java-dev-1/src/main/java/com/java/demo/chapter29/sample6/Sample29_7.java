package com.java.demo.chapter29.sample6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @Description: Sample29_7
 * @Author: miaolei
 * @Date: 2019/6/28 21:43
 */
public class Sample29_7 {

    private static final Logger logger = LoggerFactory.getLogger(Sample29_7.class);

    public static void main(String[] args) {
        String fileName = "D:\\Development\\Projects\\file1.txt";
        Employee[] employees = {new Employee("张三", 23),
        new Employee("赵云", 24), new Employee("李四", 25),
        new Employee("王五", 22)};
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(fileName));
            for (Employee em : employees) {
                dataOutputStream.writeUTF(em.getName());
                dataOutputStream.writeInt(em.getAge());
            }
            dataOutputStream.flush();
            dataOutputStream.close();
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(fileName));
            for (int i = 0; i < employees.length; i++) {
                String name = dataInputStream.readUTF();
                int age = dataInputStream.readInt();
                employees[employees.length - 1 -i] = new Employee(name, age);
            }
            dataInputStream.close();
            for (Employee em : employees) {
                logger.info("name={}，age={}", em.getName(), em.getAge());
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }

}
