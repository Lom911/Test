package com.example.demo.javacode.thread.atomarnost;

public class CounterThread implements Runnable{
    private final Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            counter.increment();
        }
    }
}
