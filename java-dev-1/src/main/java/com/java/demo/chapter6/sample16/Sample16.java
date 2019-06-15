package com.java.demo.chapter6.sample16;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @Description: Sample16
 *
 * @Date: 2018/10/29 21:50
 */
public class Sample16 {

    public static void main(String[] args) {
        GregorianCalendar now = new GregorianCalendar();
        Date date = now.getTime();
        System.out.println(date.toString());
        now.setTime(date);
        int today = now.get(Calendar.DAY_OF_MONTH);
        int month = now.get(Calendar.MONTH);
        now.set(Calendar.DAY_OF_MONTH, 1);
        int week = now.get(Calendar.DAY_OF_WEEK);
        System.out.println("星期日  星期一  星期二  星期三  星期四  星期五  星期六");
        for (int i = Calendar.SUNDAY; i < week; i++) {
            System.out.print("        ");
        }
        while (now.get(Calendar.MONTH) == month) {
            int day = now.get(Calendar.DAY_OF_MONTH);
            if (day < 10) {
                if (day == today) {
                    System.out.print("  <" + day + ">     ");
                } else {
                    System.out.print("  " + day + "     ");
                }
            } else {
                if (day == today) {
                    System.out.print(" <" + day + ">   ");
                } else {
                    System.out.print("  " + day + "    ");
                }
            }
            if (week == Calendar.SATURDAY) {
                System.out.println();
            }
            now.add(Calendar.DAY_OF_MONTH, 1);
            week = now.get(Calendar.DAY_OF_WEEK);
        }
        System.out.println();
    }

}
