package _11_collection_examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Collections {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4);
//        integers.add(6);

        List<Integer> integers2 = new ArrayList<>();
        integers2.add(6);

        Set<Integer> integers1 = Set.copyOf(integers);
//        integers1.add(10);
    }
}
