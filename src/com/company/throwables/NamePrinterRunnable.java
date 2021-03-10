package com.company.throwables;

public class NamePrinterRunnable implements Runnable{
    @Override
    public void run() {

        NameService ns = new NameService(new User(null, null));

//        try {
        System.out.println(ns.getFirstNameUppercase());
//        } catch (NullPointerException exception) {
//            System.out.println("Please enter a valid first name");
//        }
    }
}
