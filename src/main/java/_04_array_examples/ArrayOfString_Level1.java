package _04_array_examples;

import java.util.Arrays;

public class ArrayOfString_Level1 {

    public static void main(String[] args) {

        // - Create a new array of String with a size of 10
        // - Assign names of your family members to the array
        // - Display the array using Arrays.toString(..) method
        String[] familyMembers = new String[10];
        familyMembers[0] = "Dan";
        familyMembers[1] = "Mary";
        familyMembers[2] = "Tom";
        System.out.println(Arrays.toString(familyMembers));

        // - Create any array of String with the
        //   following String values
        //   - "2", "40", "7", "5"
        // - Create a new array of int from the array
        //   of String created above
        // - Remember "Integer" class has a method to convert
        //   a String to "int" value
        // - Display both arrays using Arrays.toString(..) method
        String[] myStringNumbers = {"2", "40", "7", "5"};
        int[] myIntNumbers = new int[myStringNumbers.length];
        for (int i = 0; i < myStringNumbers.length; i++) {
            myIntNumbers[i] = Integer.parseInt(myStringNumbers[i]);
        }
        System.out.println(Arrays.toString(myStringNumbers));
        System.out.println(Arrays.toString(myIntNumbers));
        System.out.println(myStringNumbers.getClass().getName());
        System.out.println(myIntNumbers.getClass().getName());

        // Print out element types of arrays
        Integer[] integers = new Integer[4];
        System.out.println("Component type of Integer[] array = "
                           + integers.getClass().getComponentType());
        double[] doubles = new double[3];
        System.out.println("Component type of doubles[] array = "
                           + doubles.getClass().getComponentType());
        long[] longs = new long[4];
        System.out.println("Component type of doubles[] array = "
                           + longs.getClass().getComponentType());

        // - Create an array of String called "myStringArrayA"
        //   with two words in the order: "Hello", "Boston"
        // - Create a new array of String called "myStringArrayB"
        //   with two words in the order: "Hello", "Boston"
        // - Create a new array os String called "myStringArrayC"
        //   with two words in the order: "Boston", "Hello"
        // - Check the equality of the two arrays of "myStringArrayA"
        //   and "myStringArrayB" and display the result
        // - Check the equality of the two arrays of "myStringArrayA"
        //   and "myStringArrayC" and display the result
        String[] myStringArrayA = {"Hello", "Boston"};
        String[] myStringArrayB = {"Hello", "Boston"};
        String[] myStringArrayC = {"Boston", "Hello"};

        boolean equals1 = myStringArrayA.equals(myStringArrayB);
        boolean equals2 = myStringArrayA == myStringArrayB;
        System.out.println(equals1);

        boolean equals3 = Arrays.equals(myStringArrayA, myStringArrayB);
        System.out.println(equals3);

        boolean equals4 = Arrays.equals(myStringArrayA, myStringArrayC);
        System.out.println(equals4);

    }
}
