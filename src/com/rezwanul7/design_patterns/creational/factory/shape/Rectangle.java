package com.rezwanul7.design_patterns.creational.factory.shape;

class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing " + getClass().getName());
    }
}
