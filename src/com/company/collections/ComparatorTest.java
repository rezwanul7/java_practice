package com.company.collections;

import com.company.collections.data.Customer;
import com.company.collections.utility.EmailComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
                new Customer("araf", "rezwanul7@gmail.com"),
                new Customer("opu", "bul@gmail.com"),
                new Customer("karim", "karim@gmail.com")
        );
        Collections.sort(customers, new EmailComparator());
        customers.forEach(customer -> System.out.println(customer.getName() + " - " + customer.getEmail()));
    }
}
