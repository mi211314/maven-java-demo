package com.java.demo.chapter29.sample7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description: Sample29_7
 * @Author: miaolei
 * @Date: 2019/6/29 21:23
 */
public class Sample29_7 {

    private static final Logger logger = LoggerFactory.getLogger(Sample29_7.class);

    public static void main(String[] args) {
        String file = "D:\\Development\\Projects\\file1.txt";
        Person[] persons = {
                new Person("张三", 23),
                new Person("李四", 25)
        };
        writeObjectToFile(persons, file);
        persons = readObjectFromFile(file);
        for (Person person : persons) {
            logger.info("name={}, age={}", person.getName(), person.getAge());
        }
        persons = new Person[2];
        persons[0] = new Person("王五",21);
        persons[1] = new Person("李六",25);
        appendObjectsToFile(persons, file);
        persons = readObjectFromFile(file);
        for (Person person : persons) {
            logger.info("name={}, age={}", person.getName(), person.getAge());
        }
    }

    private static void writeObjectToFile(Object[] objs, String fileName) {
        try {
            File file = new File(fileName);
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            for (Object obj : objs) {
                out.writeObject(obj);
            }
            out.close();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }

    private static Person[] readObjectFromFile(String fileName) {
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            List<Person> list = new ArrayList<>();
            FileInputStream fileIn = new FileInputStream(file);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            while (fileIn.available() > 0) {
                list.add((Person) in.readObject());
            }
            in.close();
            Person[] persons = new Person[list.size()];
            return list.toArray(persons);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return null;
        }
    }

    private static void appendObjectsToFile(Object[] objs, String fileName) {
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file, true)) {
                 @Override
                 protected void writeStreamHeader() {

                 }
            };
            for (Object obj : objs) {
                out.writeObject(obj);
            }
            out.close();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }

}
