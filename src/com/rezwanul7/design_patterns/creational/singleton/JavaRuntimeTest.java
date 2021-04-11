package com.rezwanul7.design_patterns.creational.singleton;

public class JavaRuntimeTest {
    public static void main(String[] args) {
        // Java Runtime is a singleton class
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Available processors " + runtime.availableProcessors());

        Runtime anotherRuntime = Runtime.getRuntime();
        if (runtime == anotherRuntime){
            System.out.println("Opps! Same runtime object. [Singleton]");
        }
    }
}
