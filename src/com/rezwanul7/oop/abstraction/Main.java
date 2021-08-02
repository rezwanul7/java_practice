package com.rezwanul7.oop.abstraction;

import com.rezwanul7.oop.encapsulation.package_a.Animal;

public class Main {

    public static void main(String[] args) {
        ExtendedAbstractAnimal abstractAnimal = new ExtendedAbstractAnimal(1) {
            @Override
            public void k() {
                System.out.println("k...");
            }
        };
        abstractAnimal.execute();

    }
}
