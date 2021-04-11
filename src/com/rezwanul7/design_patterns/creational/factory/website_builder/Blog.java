package com.rezwanul7.design_patterns.creational.factory.website_builder;

public class Blog implements Page {
    @Override
    public void render() {
        System.out.println("rendering Blog");
    }
}
