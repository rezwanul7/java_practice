package com.rezwanul7.oop.encapsulation.package_a;

final class ExtendedAnimal extends Animal{

    ExtendedAnimal(int x){
        super(x);
    }

    @Override
    protected void berk() {
        System.out.println("Gheu gheu");
    }

    public void execute(){
        System.out.println("Executing ...");
        accessPackagePrivate();
    }


}
