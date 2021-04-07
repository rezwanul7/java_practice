package com.rezwanul7.concurrency;

public class DownloadFileTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " -> Download Progress " + i * 20 + "%");
            } catch (InterruptedException e) {
//                e.printStackTrace();
                System.out.println("This thread is interrupted...");
                break;
            }

        }
        if (Thread.currentThread().isInterrupted()){
            System.out.println("This thread was interrupted...");
        }
        System.out.println("END");
    }
}
