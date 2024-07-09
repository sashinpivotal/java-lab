package _04_array_examples;

import java.util.Arrays;

public interface ArrayOfInt_Level2 {
    public static void main(String[] args) {

        // - Let's say you have any array of int
        //   initialized with 3,9,6,2,1,10,5.
        // - Leverage the logic of the "findSmallestNumberIndex(..)",
        //   which should return index of that smallestNumber.
        // - See if you can use Integer.MAX_VALUE.
        // - Create another array of int where
        //   the numbers are sorted, in other words,
        //   the new array should have 1,2,3,5,6,9,10
        //   "findSmallestNumberIndex(..)" method
        int[] unsortedInts = {3, 9, 6, 2, 1, 10, 5};
        System.out.println(Arrays.toString(unsortedInts));

        int[] sortedInts = new int[unsortedInts.length];
        int currentIndex = 0;
        for (int i = 0; i < unsortedInts.length; i++) {
            int smallestNumberIndex = findSmallestNumberIndex(unsortedInts);
            sortedInts[currentIndex++] = unsortedInts[smallestNumberIndex];
            unsortedInts[smallestNumberIndex] = Integer.MAX_VALUE;
        }

        System.out.println(Arrays.toString(sortedInts));

        // TODO-array-0x
        // - Create an array of int where
        //   the numbers are sorted, in other words,
        //   the new array should have 1,2,3,5,6,9,10.
        // - Leverage "findLargestNumberIndex(..)" method

    }

    static int findSmallestNumberIndex(int[] unsortedInts) {

        int smallestNumber = unsortedInts[0];
        int smallestNumberIndex = 0;

        for (int i = 0; i < unsortedInts.length; i++) {
            if (unsortedInts[i] < smallestNumber) {
                smallestNumber = unsortedInts[i];
                smallestNumberIndex = i;
            }
        }
        return smallestNumberIndex;
    }

    // TODO-array-0x
    // - Implement the logic of finding the largest number
    //   from an unsorted int array
    static int findLargestNumberIndex(int[] unsortedInts) {
        return 0;
    }

}
