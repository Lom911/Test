package com.example.demo.javacode.thread.ds;

import static java.lang.Math.random;

public class ProducerThread extends Thread {

    public ListEx listEx;

    @Override
    public void run() {
        while (ListEx.list.size() < 20) {
            ListEx.list.add((int) (random() * 10));
        }


    }
}

