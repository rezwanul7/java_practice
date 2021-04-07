package com.rezwanul7.throwables;

public class Main {
    public static void main(String[] args) {

//        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
//        Thread.setDefaultUncaughtExceptionHandler(new CustomExceptionHandler(defaultUncaughtExceptionHandler));
//        Thread.currentThread().setUncaughtExceptionHandler(new CustomeExceptionHandler(defaultUncaughtExceptionHandler));

        MyThreadGroup myThreadGroup = new MyThreadGroup("MyThreadGroup");

        Thread t = new Thread(myThreadGroup,new NamePrinterRunnable(), "NamePrintingThread");
        t.start();

//        for (int i = 0; i <5 ; i++) {
//            if (i==4){
//                throw new RuntimeException("Hello SOrry");
//            }
//        }

    }
}
