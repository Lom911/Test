package com.example.demo.javacode.thread.atomarnost;

public class Counter {
    private int count;

    public synchronized void increment(){
        count++;
    }

    public synchronized void decrement(){
        count--;
    }

    public int getCount() {
        return count;
    }

}
