package _13a_generics._02_withGenerics;

import _13a_generics._01_withoutGenerics.Customer;
import _13a_generics._01_withoutGenerics.MyClassCustomer;
import _13a_generics._01_withoutGenerics.MyClassWithInteger;
import _13a_generics._01_withoutGenerics.MyClassWithLong;

public class Main {
    public static void main(String[] args) {

        // TODO-generics-03
        // - Note that now with Generics, ypu are going to use
        //   the same generic class to create an object of
        //   specific type
        MyClassWithGenerics<Integer> integerMyClassWithGenerics = new MyClassWithGenerics<>(5);
        integerMyClassWithGenerics.display();
        MyClassWithGenerics<Long> longMyClassWithGenerics = new MyClassWithGenerics<>(10L);
        longMyClassWithGenerics.display();
        MyClassWithGenerics<Customer> customerMyClassWithGenerics = new MyClassWithGenerics<>(new Customer());
        customerMyClassWithGenerics.display();
        // - Create an object of MyClassWithGenerics with String type
    }
}
