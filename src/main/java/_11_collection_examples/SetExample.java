package _11_collection_examples;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {

        Set<String> cities = new HashSet<>();

        cities.add("New York");
        boolean boston = cities.add("Boston");
        System.out.println(boston);
        System.out.println(cities);
        boolean new_york = cities.add("New York");
        System.out.println(new_york);
        System.out.println(cities);
        List<String> strings = new ArrayList<>(cities);

        List<String> states = new ArrayList<>();
        states.add("WA");
        states.add("NY");
        states.add("WA");
        System.out.println(states);

        Set<String> statesAsASet = new HashSet<>(states);
        System.out.println(statesAsASet);

        if (new Integer(10) > new Integer(4)) {
            System.out.println("10 is greater than 4");
        }

        int i2 = new Integer(10).compareTo(new Integer(10));
        System.out.println(i2);

        int i = new String("xyz").compareTo(new String("xyz"));
        System.out.println(i);

    }
}
