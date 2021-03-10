package com.company.collections;

public class Customer implements Comparable<Customer> {
    private String name;
    private String email;

    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public int compareTo(Customer o) {
        return name.compareTo(o.name);
    }
}
