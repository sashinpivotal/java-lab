package _23_streams.streams_basics;

import java.util.Optional;
import java.util.stream.Stream;

public class FindFirst {

    public static void main(String[] args) {

        Stream<String> names
                = Stream.of("Sang", "John", "David", "Mary", "Dadu");

        Optional<String> firstNameWithD
                = names.filter(i -> i.startsWith("D")).findFirst();
        if (firstNameWithD.isPresent()) {
            System.out.println("First Name starting with D = " + firstNameWithD.get());
        }

        Optional<String> anyNameWithD
                = names.filter(i -> i.startsWith("D")).findAny();
        if (anyNameWithD.isPresent()) {
            System.out.println("Any Name starting with D = " + anyNameWithD.get());
        }

        // - From the "names" stream, filter names whose length is greater than 3
        // - Use findFirst() and findAny()
        names = Stream.of("Sang", "John", "David", "Mary", "Dadu");
        System.out.println(names.filter(name -> name.length() > 3)
                .findFirst());

        names = Stream.of("Sang", "John", "David", "Mary", "Dadu");
        System.out.println(names.filter(name -> name.length() > 3)
                .findAny());

        // - Given a list of numbers of 1,2,3,4,5,6,7,8,9 find the first
        //   number whose is greater than 3 and even number and double it
        // - Convert the lambda expression to method references

        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(numbers
                .filter(number -> number > 3)
                .filter(FindFirst::isNumberGreaterThan3)
                .filter(FindFirst::isNumberEven)
                .map(FindFirst::doubleIt)
                .findFirst());

    }

    public static boolean isNumberGreaterThan3(int number) {
        return number > 3;
    }

    public static boolean isNumberEven(int number) {
        return number % 2 == 0;
    }

    public static int doubleIt(int number) {
        return number * 2;
    }

}