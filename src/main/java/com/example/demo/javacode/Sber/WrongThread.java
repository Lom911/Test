package com.example.demo.javacode.Sber;

import java.util.ArrayList;
import java.util.Random;

 class WrongThread {
    public static class WVPE extends RuntimeException {
    };
    public static final Integer wrongNumber = 25;

    public static void check(Integer a) {
        if (wrongNumber.equals(a)) {
            throw new WVPE();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        final var rnd = new ArrayList<Integer>();

        var random = new Random();
        random.ints(200, 0, 50).forEach(rnd::add);

        try {
            var check = new Thread() {
                public void run() {
                    rnd.forEach(WrongThread::check);
                }
            };
            check.start();
            check.join();
        } catch (WVPE e){
            System.out.println(String.format("%s found", wrongNumber));
        }
    }
}
