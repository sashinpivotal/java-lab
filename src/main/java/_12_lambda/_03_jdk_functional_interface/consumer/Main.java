package _12_lambda._03_jdk_functional_interface.consumer;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        // TODO-lambda-functional-interface-01:
        // - Study how an lambda object of
        //   Consumer<String> functional interface type
        //   is defined and invoked below
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Hello World!");
    }
}
