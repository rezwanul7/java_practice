package com.rezwanul7.collections;

import com.rezwanul7.collections.data.Customer;

import java.util.*;

public class ComparableTest {
    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(new Customer("araf"), new Customer("opu"), new Customer("karim"));
        Collections.sort(customers);
        customers.forEach(customer -> System.out.println(customer.getName()));
    }
}
