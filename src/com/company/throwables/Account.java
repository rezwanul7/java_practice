package com.company.throwables;

import java.io.IOException;

public class Account {
    public void deposit(float value) throws IOException {
//        if (value<500) throw new IllegalArgumentException("At-least 500$ is needed to deposit");
        if (value<500) throw new IOException("At-least 500$ is needed to deposit");
    }
}
