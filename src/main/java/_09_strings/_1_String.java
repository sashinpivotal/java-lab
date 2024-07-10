package _09_strings;

public class _1_String {

    public static void main(String[] args) {

        String str = "Hello, World!";

        // TODO-strings_01:
        // - Find and use the method in the String class
        //   to print the length of the string.
        // - Output: Length of string: 13

        // TODO-strings-02
        // - Find and sue the method in the String class
        //   to print the character at a specific index
        //   in the string.
        // - Output: character at index 7: W

        // TODO-strings-03
        // - Find and sue the method in the String class
        //   to print a part of the string.
        // - Output: Substring: World

        // TODO-strings-04
        // - Use the indexOf() method to find the position
        //   of a character in the string.
        // - Output: Index of 'W': 7

        // TODO-strings-05
        // - Use the toLowerCase() method to convert the
        //   string to lowercase and print it.
        // - Output: Lowercase: hello, world!

        // TODO-strings-06
        // - Use the toUpperCase() method to convert
        //   the string to uppercase and print it.
        // - Output: Uppercase: HELLO, WORLD!

        // TODO-strings-07
        // - Use the trim() method to remove whitespace
        //   from the beginning and end of a string and print it.
        // - Use the following as test data
        //   - "   Trim me!   " -> Trimmed: 'Trim me!'

        // TODO-strings-08
        // - Use printf() and format() to print 2 formatted strings.
        // - Output:
        //      printf(): Hello, World!
        //      format(): Hello, World!
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