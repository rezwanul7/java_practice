package com.company.throwables;

public class NameService {
    public User user;

    public NameService(User user) {
        this.user = user;
    }

    public String getFirstNameUppercase() {
        return user.getFirstName().toUpperCase();
    }

    public String getFullNameUppercase() {
        return (user.getFirstName() + " " + user.getLastName()).toUpperCase();
    }
}
