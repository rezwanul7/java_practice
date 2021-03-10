package com.company.throwables;

//Setting this handler is a per-thread base solution. Thread A will not use Thread’s B handler and vice versa.
public class CustomExceptionHandler implements  Thread.UncaughtExceptionHandler{
    private Thread.UncaughtExceptionHandler oldUncaughtExceptionHandler;

    public CustomExceptionHandler(Thread.UncaughtExceptionHandler oldUncaughtExceptionHandler) {
        this.oldUncaughtExceptionHandler = oldUncaughtExceptionHandler;
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {

        System.out.println("custom handler for uncaughtException: in " + t.getName());
        e.printStackTrace();
        //delegating to previous one
//        oldUncaughtExceptionHandler.uncaughtException(t,e);
//        e.printStackTrace();
    }
}
