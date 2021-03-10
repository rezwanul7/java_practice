package com.company.throwables;

import java.io.IOException;

public class DepositValidationTest {
    public static void main(String[] args) {
        Account account = new Account();
        try {
            account.deposit(5);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
