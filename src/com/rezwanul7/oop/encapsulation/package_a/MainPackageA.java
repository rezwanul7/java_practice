package com.rezwanul7.oop.encapsulation.package_a;

public class MainPackageA {

    public static void main(String[] args) {
//        Animal animal = new Animal();
//        animal.accessPublic();
////        animal.accessPrivate(); not possible
//        animal.accessProtected();
//        animal.accessPackagePrivate();
//
        Animal extendedAnimal = new ExtendedAnimal(13);
//        extendedAnimal.accessPublic();
//        extendedAnimal.accessPackagePrivate();
//        extendedAnimal.accessProtected();
        ((ExtendedAnimal) extendedAnimal).execute();

    }
}
