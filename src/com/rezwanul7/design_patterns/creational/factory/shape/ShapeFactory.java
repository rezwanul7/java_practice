package com.rezwanul7.design_patterns.creational.factory.shape;

public class ShapeFactory {
    public Shape createShape(String shapeType){
        switch (shapeType.toLowerCase()){
            case "rectangle":
                return new Rectangle();
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            default:
                throw new IllegalStateException("Unexpected value: " + shapeType);
        }
    }
}
