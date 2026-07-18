package _13a_generics._01_withoutGenerics;

public class Main {
    public static void main(String[] args) {

        // TODO-generics-01
        // - Take a look at MyClassWithInteger, MyClassWithLong
        //   MyClassCustomer classes
        // - Observe that without using Generics, you
        //   will have to define a new class for each
        //   type even though the behavior is the
        //   same for these classes
        MyClassWithInteger myClassWithInteger = new MyClassWithInteger();
        myClassWithInteger.display();
        MyClassWithLong myClassWithLong = new MyClassWithLong();
        myClassWithLong.display();
        MyClassCustomer myClassCustomer = new MyClassCustomer();
        myClassCustomer.display();

    }
}
