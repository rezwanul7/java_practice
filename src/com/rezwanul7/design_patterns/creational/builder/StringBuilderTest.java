package com.rezwanul7.design_patterns.creational.builder;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append(43);
        builder.append("Hello");
        builder.append("Okay!");

        System.out.println(builder.toString());
        System.out.println(builder.reverse());
        System.out.println(builder.toString());
    }
}