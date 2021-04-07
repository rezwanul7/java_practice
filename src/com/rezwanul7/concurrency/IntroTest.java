package com.rezwanul7.concurrency;

public class IntroTest {
    public static void main(String[] args) {
        System.out.println(Thread.activeCount()); //main and garbage collector
        System.out.println(Thread.currentThread().getName());
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
