package _04_array_examples;

import java.util.Arrays;

public class ArrayOfInt_Level1 {

    static int[] ints3;
    static String myString;

    public static void main(String[] args) {

        // Create an array of int with size of 10
        int[] ints = new int[10];
        System.out.println(Arrays.toString(ints));

        // Create an array of String type with size of 5.
        // Note that the elements are all null.
        String[] strings = new String[5];
        String myString = null;
        System.out.println(strings.length);

        // Create an array of int with some given int
        // values.
        int[] ints4 = {3, 9, 6, 3, 1, 10, 5};
        System.out.println(Arrays.toString(ints4));

        // - Find the largest number from an int array.
        // - Start the search from the last element.
        int largestNumberFromInts4Array = ints4[ints4.length/2];
        for (int i = ints4.length - 1; i >=0 ; i--) {
            if (largestNumberFromInts4Array < ints4[i]) {
                largestNumberFromInts4Array = ints4[i];
            }
        }
        System.out.println("first try: " + largestNumberFromInts4Array);

        // - Find the largest number from an int array.
        // - Start the search from the first element.
        for (int i = 0; i < ints4.length; i++) {
            if (largestNumberFromInts4Array < ints4[i]) {
                largestNumberFromInts4Array = ints4[i];
            }
        }
        System.out.println("second try: " + largestNumberFromInts4Array);

        // Change each number in the array by multiplying
        // by 2.
        for (int i = 0; i < ints4.length; i++) {
            ints4[i] *= 2;
        }
        System.out.println(Arrays.toString(ints4));

    }
}
