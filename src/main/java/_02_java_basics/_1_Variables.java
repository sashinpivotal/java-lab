package _02_java_basics;

import javax.sound.midi.Soundbank;

public class _1_Variables {
    public static void main(String[] args) {

        // TODO-variables-01:
        // - Create a variable called "name" with proper type
        //   and assign your name to it.
        // - Print out a message saying "Hello, my name is ____"
        //   with your name in the blank.
        String name = "Sang Shin";
        System.out.println("Hello, my name is " + name);

        // TODO-variables-02:
        // - Create two int type variables a and b.
        // - Assign some values to them and print out
        //   the sum of a and b.
        int a = 10;
        int b = 20;
        System.out.println("The sum of two integers = " + (a+b));

        // TODO-variables-03:
        // - Create two int variables x and y.
        // - Assign x the value of 10 and y the value of 20.
        // - Then, swap the values of x and y, using the
        //   third variable: int tmp;
        // - Print the values of x and y before and after.
        int x = 10;
        int y = 20;
        System.out.println("Before swapping: x = " + x + ", y = " + y);
        int tmp = x;
        x = y;
        y = tmp;
        System.out.println("After swapping: x = " + x + ", y = " + y);

    }
}








































/*
            String name = "John";
            System.out.println("Hello, my name is " + name);
*/

/*
            int a = 5;
            int b = 10;
            System.out.println("The sum is: " + (a + b));
*/

/*
            int x = 10;
            int y = 20;
            int temp = x;
            x = y;
            y = temp;
            System.out.println("x: " + x + ", y: " + y);
*/