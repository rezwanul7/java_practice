package com.company.concurrency;

public class ThreadJoin {
    public static void main(String[] args) {
        Thread thread = new Thread(new DownloadFileTask());
        thread.start();
        System.out.println("Total threads count: " + Thread.activeCount());

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Total threads count: " + Thread.activeCount());
        System.out.println("we are ready to process the downloaded file");
    }
}
