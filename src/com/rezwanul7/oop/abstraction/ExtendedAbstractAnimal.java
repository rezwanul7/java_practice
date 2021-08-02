package com.rezwanul7.oop.abstraction;

public abstract class ExtendedAbstractAnimal extends AbstractAnimal{


    public ExtendedAbstractAnimal(int x) {
        super(x);
    }

    public ExtendedAbstractAnimal(int x, int y) {
        super(x, y);
    }

    public abstract void  k();

    @Override
    public void accessPublic() {

    }

    public void execute(){
        k();
    }
}
