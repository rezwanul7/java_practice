package com.rezwanul7.design_patterns.creational.singleton;

public class LazySession {
    private static LazySession session;

    private boolean isLoggedIn;
    private String username;
    private String email;

    private LazySession(){
        loadSessionInfoFromFile();
    }

    public static LazySession getInstance(){
        //Lazy Loading
        if (session==null){
            session = new LazySession();
        }
        return session;
    }

    public boolean isLoggedIn() {

        return isLoggedIn;
    }

    public void loadSessionInfoFromFile(){
        //simulate reading and updating session info
        username = "rezwan";
        email="rezwanul7@gmail.com";
        isLoggedIn = true;
    }
}