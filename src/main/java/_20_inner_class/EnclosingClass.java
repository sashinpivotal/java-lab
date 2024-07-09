package _20_inner_class;

public class EnclosingClass {

    private int enclosingField;
    private void someMethod() {
    }

    public void doSomething() {
        InnerClass inner = new InnerClass();
        inner.someInnerMethod();
        inner.innerField = 5;
    }

    // Inner class defined within a class
    private class InnerClass {

        private int innerField = 4;
        private void someInnerMethod() {
            someMethod();
            enclosingField = 1;
        }
    }

}
