package com.rezwanul7.design_patterns.creational.singleton;

public class Session {
    //EagerLoading
    private static Session session = new Session();;

    private boolean isLoggedIn;
    private String username;
    private String email;

    private Session(){
        loadSessionInfoFromFile();
    }

    public static Session getInstance(){
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