package _13a_generics;

import _13a_generics._02_withGenerics.MyClassWithGenerics;
import _13a_generics._01_withoutGenerics.MyClassWithInteger;
import _13a_generics._01_withoutGenerics.MyClassCustomer;

public class Main {

    public static void main(String[] args) {

        // Using non-generic class
        MyClassWithInteger myClassWithInteger
                = new MyClassWithInteger();
        MyClassCustomer myClassCustomer
                = new MyClassCustomer();

        // Using generic class
        MyClassWithGenerics<Integer> integerMyClassWithGenerics
                = new MyClassWithGenerics<>();
        MyClassWithGenerics<Customer> customerMyClassWithGenerics
                = new MyClassWithGenerics<>();
    }
}
