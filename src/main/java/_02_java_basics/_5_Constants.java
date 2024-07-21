package _02_java_basics;

public class _5_Constants {

    // TODO-constants-01
    // - Declare a constant named MY_PI of double type
    //   and assign a value of Math.PI
    static final double MY_PI = Math.PI;


    // TODO-constants-02
    // - Declare a constant named MY_CONSTANT_VALUE of int
    //   type and assign a value of 100 to it.
    static final int MY_CONSTANT_VALUE = 100;

    public static void main(String[] args) {

        // TODO-constants-03
        // - Print the values of MY_PI and MY_CONSTANT_VALUE
        System.out.println(MY_PI + ", " + MY_CONSTANT_VALUE);
        // - Try to change value of these constants and see
        //   what happens.
        // MY_CONSTANT_VALUE = 400;

    }
}





































/*
        final double PI = 3.14;
        System.out.println("The value of PI is: " + PI);
 */


/*

        final int MAX_VALUE = 100;
        // MAX_VALUE = 200; // Uncommenting this will result in an error because you can't modify a final variable.
        System.out.println("The value of MAX_VALUE is: " + MAX_VALUE);
 */
