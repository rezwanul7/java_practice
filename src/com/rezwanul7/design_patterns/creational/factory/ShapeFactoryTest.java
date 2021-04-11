package com.rezwanul7.design_patterns.creational.factory;

import com.rezwanul7.design_patterns.creational.factory.shape.Shape;
import com.rezwanul7.design_patterns.creational.factory.shape.ShapeFactory;

public class ShapeFactoryTest {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.createShape("circle");
        circle.draw();
        Shape rectangle = shapeFactory.createShape("rectangle");
        rectangle.draw();
        Shape square = shapeFactory.createShape("square");
        square.draw();
    }
}
