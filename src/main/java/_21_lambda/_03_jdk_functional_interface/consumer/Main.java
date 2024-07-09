package _21_lambda._03_jdk_functional_interface.consumer;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Hello World!");
    }
}
