package _23_streams.streams_basics;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        Optional<Integer> intOptional = numbers.stream()
                .reduce((i, j) -> {
                    return i * j;
                });
        if (intOptional.isPresent()) {
            System.out.println("Multiplication through reduce = " + intOptional.get()); // 24
        }

        intOptional = numbers.stream()
                .reduce((i, j) -> {
                    return i + j;
                });
        if (intOptional.isPresent()) {
            System.out.println("Addition through reduce = " + intOptional.get()); // 10
        }

        List<String> fruits = Arrays.asList("apple", "orange", "cherry");

        Optional<String> stringOptional = fruits.stream()
                .reduce((i, j) -> {
                    return i.concat(j);
                });
        if (stringOptional.isPresent()) {
            System.out.println("Concatenation through reduce = " + stringOptional.get());
        }

        // - Create a names list with "Sang","John","David", "Mary", "Dadu"
        // - Perform reduce operation so that a string that is made of first character
        //   of each name is constructed, in other words, "SJDMD" should be the result
        //   (Hint: See if reduce((i, j) -> i.substring(0,1).concat(j.substring(0,1))
        //   gives result you want - it will not. See if map operator can be used to
        //   solve it.)
        List<String> names = Arrays.asList("Sang", "John", "David", "Mary", "Dadu");
        Optional<String> stringOptional2 = names.stream()
                .map(name -> name.substring(0, 1))
                .reduce((i, j) -> i.concat(j));
        if (stringOptional2.isPresent()) {
            System.out.println("Concatenation through reduce2 = " + stringOptional2.get());
        }

    }

}