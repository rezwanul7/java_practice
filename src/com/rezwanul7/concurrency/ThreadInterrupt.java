package com.rezwanul7.concurrency;

public class ThreadInterrupt {
    public static void main(String[] args) {
        Thread downloaderThread = new Thread(new DownloadFileTask());
        downloaderThread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //cancelling the downloaderThread after 2secs
        downloaderThread.interrupt();

    }
}
