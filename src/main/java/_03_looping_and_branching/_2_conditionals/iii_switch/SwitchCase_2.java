package _03_looping_and_branching._2_conditionals.iii_switch;

import java.util.Scanner;

public class SwitchCase_2 {
    public static void main(String[] args) {
        // TODO-conditionals-06
        // - Create a `char` variable with a value 'a'.
        // - Use switch/case to check if it's a vowel or a consonant.
        // - Print the result.
        // - Run the program a few times,
        //   each time changing the `a` value.
        char my_char = 'a';
        switch (my_char) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("It is a Vowel");
                break;
            default:
                System.out.println("It is Consonant");
        }
    }
}



































/*
        char letter = 'a';
        switch(letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(letter + " is a vowel");
                break;
            default:
                System.out.println(letter + " is a consonant");
        }
 */