package _23_streams.streams_basics;

import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void main(String[] args) {

        // display numbers that are greater than 6
        List<Integer> numbers
                = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        numbers.stream()
                .filter(p -> p > 6)
                .forEach(p -> System.out.println(p + " "));

        // TODO-01: from "numbers" list above, display only odd numbers

        // from a list of number strings, select numbers
        // whose numeric value is greater than 10 and
        // compute the sum of it
        List<String> numberStrings
                = Arrays.asList("5", "16", "8", "24", "5");
        int sum1 = numberStrings.stream()                  // convert the List to  sequential stream
                .mapToInt(stringNumber -> Integer.parseInt(stringNumber))
                .filter(i -> i > 10)       // filter only the number > 10  (Predicate)
                .sum();                    // perform sum operation
        System.out.println(sum1);

        // TODO-02: from "numberStrings" above, select only
        //          even numbers and then sum their
        //          square values

        // perform the same as above in parallel
        int sum2 = numberStrings.parallelStream()                  // convert the List to  parallel stream
                .mapToInt(stringNumber -> Integer.parseInt(stringNumber))
                .filter(i -> i > 10)       // filter only the number > 10  (Predicate)
                .sum();                      // perform sum operation
        System.out.println(sum2);

        // TODO-03: Rewrite the solution of TODO-02 using
        //          parallel stream

    }
}
