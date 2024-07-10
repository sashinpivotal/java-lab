package _09_strings.exercises;

public class _1_StringCommonMethods {

    public static void main(String[] args) {


        String str = "Hello, World!";

        // Exercise 1: Find and sue the method in the String class to print the length of the string.
        // Output: Length of string: 13


        // Exercise 2: Find and sue the method in the String class  to print the character at a specific index in the string.
        // Output: haracter at index 7: W


        // Exercise 3: Find and sue the method in the String class  to print a part of the string.
        // Output: Substring: World


        // Exercise 4: Use the indexOf() method to find the position of a character in the string.
        // Output: Index of 'W': 7


        // Exercise 5: Use the toLowerCase() method to convert the string to lowercase and print it.
        // Output: Lowercase: hello, world!

        // Exercise 6: Use the toUpperCase() method to convert the string to uppercase and print it.
        // Output: Uppercase: HELLO, WORLD!

        // Exercise 7: Use the trim() method to remove whitespace from the beginning and end of a string and print it.
        // "   Trim me!   " -> Output: Trimmed: 'Trim me!'

        // Exercise 8: Use printf() and format() to print 2 formatted strings.
        // Output:
        // printf(): Hello, World!
        // format(): Hello, World!
    }

}

















































/*
        String str = "Hello, World!";
        // Exercise 1: Use the length() method to print the length of the string.
        int length = str.length();
        System.out.println("Length of string: " + length);

        // Exercise 2: Use the charAt() method to print the character at a specific index in the string.
        char ch = str.charAt(7);
        System.out.println("Character at index 7: " + ch);

        // Exercise 3: Use the substring() method to print a part of the string.
        String sub = str.substring(7, 12);
        System.out.println("Substring: " + sub);

        // Exercise 4: Use the indexOf() method to find the position of a character in the string.
        int index = str.indexOf('W');
        System.out.println("Index of 'W': " + index);

        // Exercise 5: Use the toLowerCase() method to convert the string to lowercase and print it.
        String lower = str.toLowerCase();
        System.out.println("Lowercase: " + lower);

        // Exercise 6: Use the toUpperCase() method to convert the string to uppercase and print it.
        String upper = str.toUpperCase();
        System.out.println("Uppercase: " + upper);

        // Exercise 7: Use the trim() method to remove whitespace from the beginning and end of a string and print it.
        String trimmed = "   Trim me!   ".trim();
        System.out.println("Trimmed: '" + trimmed + "'");

        // Exercise 8: Use printf() and format() to print formatted strings.
        System.out.printf("printf(): %s%n", str);
        String formatted = String.format("format(): %s", str);
        System.out.println(formatted);

 */