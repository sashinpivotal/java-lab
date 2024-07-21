package _06_arrays;

import java.util.Arrays;

public class _1_ArrayOfInt {

    static int[] ints3;
    static String myString;

    public static void main(String[] args) {

        // Create an array of int with some given int
        // values of {3, 9, 6, 3, 1, 10, 5}.
        int[] ints = {3, 9, 6, 3, 1, 10, 5};
        System.out.println(Arrays.toString(ints));

        // TODO-arrays-01
        // - Compute the sum and average value of the "ints"
        //   array
        // - Print the result
        int sum = 0;
        int average = 0;
        for (int value : ints) {
            sum += value;
        }
        average = sum / ints.length;
        System.out.println("sum = " + sum + ", average = " + average);

        // TODO-arrays-02
        // - Find the largest number from the "ints" array
        // - Print the result
        int largestNumber = Integer.MIN_VALUE;
        for (int value: ints) {
            if (value > largestNumber) {
                largestNumber = value;
            }
        }
        System.out.println("largest number = " + largestNumber);

        // TODO-arrays-03
        // - Change each number in the array by multiplying
        //   by 2. In other words, the "ints" array
        //   should have {6, 18, 12, 6, 2, 20, 10}
        // - Display the array before and after
        System.out.println("Before: " + Arrays.toString(ints));
        for (int index = 0; index < ints.length; index++) {
            ints[index] *= 2;
        }
        System.out.println("After: " + Arrays.toString(ints));

    }
}
