package _07_abstract_examples.misc;

public abstract class MyAbstractClass {

    private int myInstanceInt;

    public MyAbstractClass(int myInstanceInt) {
        this.myInstanceInt = myInstanceInt;
    }

    public abstract void myMethod();
}

