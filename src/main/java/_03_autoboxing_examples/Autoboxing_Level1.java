package _03_autoboxing_examples;

import java.util.Arrays;

public class Autoboxing_Level1 {

    // - Create an array of Integer called "myIntegerArray"
    //   and assign primitive int values 1,2,3,4,5,6 to it
    // - Create a new array of int called "myIntArray" and
    //   initialize it with the values of the "myIntegerArray"
    //   array

    public static void main(String[] args) {
        // Example of auto-boxing from int to Integer
        Integer[] myIntegerArray = {1, 2, 3, 4, 5, 6,};

        // Example of unboxing from Integer to int
        int myInt = new Integer(4);

        // Example of unboxing from Integer array to int array
        int[] myIntArray = new int[myIntegerArray.length];
        for (int i = 0; i < myIntegerArray.length; i++) {
            myIntArray[i] = myIntegerArray[i];
        }
        System.out.println(Arrays.toString(myIntArray));

    }

}
