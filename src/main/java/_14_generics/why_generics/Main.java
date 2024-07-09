package _14_generics.why_generics;

import _14_generics.why_generics.withGenerics.MyClassWithGenerics;
import _14_generics.why_generics.withoutGenerics.MyClassWithInteger;
import _14_generics.why_generics.withoutGenerics.MyClassCustomer;

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
