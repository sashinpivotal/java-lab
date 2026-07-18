package _13a_generics._02_withGenerics;

// TODO-generics-02
// - Note that now with Generics, you define a single
//   generic class as shown below
public class MyClassWithGenerics<E> {

    private E e;

    public MyClassWithGenerics(E e) {
        this.e = e;
    }

    public void display() {
        System.out.println(e);
    }
}
