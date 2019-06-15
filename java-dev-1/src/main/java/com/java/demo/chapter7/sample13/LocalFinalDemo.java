package com.java.demo.chapter7.sample13;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @Description: LocalFinalDemo
 *
 * @Date: 2018/11/18 21:59
 */
public class LocalFinalDemo {

    private static final Logger logger = LoggerFactory.getLogger(LocalFinalDemo.class);

    public LocalFinalDemo(String s) {
        JFrame f = new JFrame(s);
        f.setSize(100, 100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = f.getContentPane();
        final JButton b = new JButton("Button");
        JLabel l = new JLabel("Label");
        contentPane.add(b);
        contentPane.add(l);
        f.setVisible(true);
        l.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                b.requestFocus();
                logger.info("Key Typed");
            }
        });
    }

    public static void main(String[] args) {
        new LocalFinalDemo("JFrame");
    }

}
