package _13b_streams._1_streams_basics;

import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void main(String[] args) {

        // TODO-streams-01:
        // - Study how the logic of "display numbers that
        //   are greater than 6 from the numbers array"
        //   written using streams
        List<Integer> numbers
                = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        numbers.stream()
                .filter(p -> p > 6)
                .forEach(p -> System.out.println(p + " "));

        // - Write code to display only odd numbers
        //   from the numbers array

        // TODO-streams-02:
        // - Study how the logic of "from a list of number
        //   strings, select numbers whose numeric value
        //   is greater than 10 and compute the sum of it"
        //   is written using streams
        List<String> numberStrings
                = Arrays.asList("5", "16", "8", "24", "5");
        int sum1 = numberStrings.stream()                  // convert the List to  sequential stream
                .mapToInt(stringNumber -> Integer.parseInt(stringNumber))
                .filter(i -> i > 10)       // filter only the number > 10  (Predicate)
                .sum();                    // perform sum operation
        System.out.println(sum1);

        // - Write code to select only
        //   even numbers and then sum their
        //   square values using streams

        // TODO-streams-03:
        // - Study how parallel steam us leveraged
        int sum2 = numberStrings.parallelStream()                  // convert the List to  parallel stream
                .mapToInt(stringNumber -> Integer.parseInt(stringNumber))
                .filter(i -> i > 10)       // filter only the number > 10  (Predicate)
                .sum();                      // perform sum operation
        System.out.println(sum2);

    }
}
