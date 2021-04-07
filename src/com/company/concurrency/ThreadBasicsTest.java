package com.company.concurrency;

public class ThreadBasicsTest {
    public static void main(String[] args) {
        //starting a new thread
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
        }

        System.out.println("Total threads count: " + Thread.activeCount());
    }
}
