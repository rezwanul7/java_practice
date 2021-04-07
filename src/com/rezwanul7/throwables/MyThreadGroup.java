package com.rezwanul7.throwables;

public class MyThreadGroup extends ThreadGroup{

    public MyThreadGroup(String name) {
        super(name);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        super.uncaughtException(t, e);
        System.out.println("MyThreadGroup: uncaughtException " +e.getMessage());
    }
}
