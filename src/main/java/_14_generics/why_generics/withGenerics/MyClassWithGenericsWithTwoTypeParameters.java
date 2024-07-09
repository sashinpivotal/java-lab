package _14_generics.why_generics.withGenerics;

public class MyClassWithGenericsWithTwoTypeParameters<T,V> {

    private T t;
    private V v;

    public MyClassWithGenericsWithTwoTypeParameters(T t, V v) {
        this.t = t;
        this.v = v;
    }

    public void display() {

        System.out.println(t);
        System.out.println(v);
    }
}

class Main2 {
    public static void main(String[] args) {

    }
}

class JustAnotherClass {

    public void someMethod() {

        new MyClassWithGenericsWithTwoTypeParameters(
                new String("x"),
                new String("y"));

    }
}
