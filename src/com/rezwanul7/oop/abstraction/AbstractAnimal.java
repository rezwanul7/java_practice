package com.rezwanul7.oop.abstraction;
import com.rezwanul7.oop.abstraction.interfaces.Animal;

public abstract class AbstractAnimal implements Animal {


    public AbstractAnimal(int x){

    }
    public AbstractAnimal(int x, int y){

    }
    public abstract void accessPublic();

    private void accessPrivate() {

    }
    protected void accessProtected() {

    }

    void accessPackagePrivate() {

    }
}
