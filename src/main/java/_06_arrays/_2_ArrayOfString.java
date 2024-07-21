package _06_arrays;

import java.util.Arrays;

public class _2_ArrayOfString {

    public static void main(String[] args) {

        // - Create a new array of String with a size of 10
        // - Assign names of your family members to the array
        // - Display the array using Arrays.toString(..) method
        String[] familyMembers = new String[10];
        familyMembers[0] = "Dan";
        familyMembers[1] = "Mary";
        familyMembers[2] = "Tom";

        // TODO-arrays-04: null elements in an array
        // - Display only elements of familyMembers array
        //   that contains valid family name like following
        //   Dan, Mary, Tom
        for (String familyMember : familyMembers) {
            if (familyMember != null) {
                System.out.println(familyMember);
            }
        }

        // TODO-arrays-05: conversion of String number to int
        // - Given any array of String called myStringNumbers below
        String[] myStringNumbers = {"2", "40", "7", "5"};
        // - Create a new array of int called myIntNumbers
        //   from myStringNumbers array above
        // - Remember "Integer" class has a method to convert
        //   a String to "int" value
        // - Display both arrays using Arrays.toString(..) method
        int[] myIntNumbers = new int[myStringNumbers.length];
        for (int index = 0; index < myStringNumbers.length; index++) {
            myIntNumbers[index] = Integer.parseInt(myStringNumbers[index]);
        }
        System.out.println("myStringNumbers = " + Arrays.toString(myStringNumbers));
        System.out.println("myIntNumbers = " + Arrays.toString(myIntNumbers));

        // TODO-arrays-06: equality testing of array
        // - Given the following three arrays of String
        String[] myStringArrayA = {"Hello", "Boston"};
        String[] myStringArrayB = {"Hello", "Boston"};
        String[] myStringArrayC = {"Boston", "Hello"};

        // - Check the equality of the two arrays of "myStringArrayA"
        //   and "myStringArrayB" using
        //   <array-object>.equals method like following
        //   and display the result
         boolean equals1 = myStringArrayA.equals(myStringArrayB);

        // - Check the equality of the two arrays of "myStringArrayA"
        //   and "myStringArrayB" using
        //   equals method of Arrays utility class like following
        //   and display the result
         boolean equals2 = Arrays.equals(myStringArrayA, myStringArrayB);

        // - Check the equality of the two arrays of "myStringArrayA"
        //   and "myStringArrayC" using
        //   equals method of Arrays utility class like following
        //   and display the result
         boolean equals3 = Arrays.equals(myStringArrayA, myStringArrayC);

        System.out.println("equals1 = " + equals1);
        System.out.println("equals2 = " + equals2);
        System.out.println("equals3 = " + equals3);

    }
}
