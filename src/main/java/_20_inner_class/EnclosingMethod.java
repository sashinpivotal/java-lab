package _20_inner_class;

public class EnclosingMethod {

    public void someMethod() {

        // Define an inner class within a method
        class LocalInner {
            void someInnerMethod() {

            }
        }

        LocalInner localInner = new LocalInner();
        localInner.someInnerMethod();

    }
}
