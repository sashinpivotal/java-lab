package _14_generics.why_generics.withoutGenerics;


public class MyClassCustomer<Customer> {

    private Customer customer;

    public void display() {
        System.out.println(customer);
    }

}

