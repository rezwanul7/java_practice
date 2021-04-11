package com.rezwanul7.design_patterns.creational.singleton;

public class SingletonSessionTest {
    public static void main(String[] args) {
        Session session = Session.getInstance();
        System.out.println("LoggedIn Status : " + (session.isLoggedIn() ? "Logged In" : "LoggedOut"));
    }
}