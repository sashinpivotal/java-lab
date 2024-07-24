package _06_arrays;

import java.util.Arrays;

public class _3_ArrayOfString {

    public static void main(String[] args) {

        // TODO-arrays-07: split method String
        // - Given a testString below
        String testString = "I love Boston.  Yes, you do love boston.";
        // - Create an array of String by using "split" method
        //   of String class
        //   using "[, ?.@]+" as regular expression
        // - Display the array of String created
        String[] arrayOfString = testString.split("[, ?.@]+");
        System.out.println(Arrays.toString(arrayOfString));

        // TODO-arrays-08 (Optional): create unique words array
        // - Create a new array of String with unique word (but
        //   case-insensitive manner) from
        //   the array of String that was created above.
        //   The resulting array should be all lower-case, however.
        //   In other words, the new array should contain
        //   "i", "love", "boston", "yes", "do" as its
        //   element values
        // - Display the newly created array
        // - (Do not use Set, Do not use Stream.)
        String[] uniqueWords = new String[arrayOfString.length];
        int currentIndex = 0;
        for (String word : arrayOfString) {
            if (checkIfWordIsUnique(word, uniqueWords, currentIndex)) {
                uniqueWords[currentIndex++] = word.toLowerCase();
            }
        }
        System.out.println(Arrays.toString(uniqueWords));

    }

    private static boolean
    checkIfWordIsUnique(String word, String[] uniqueWords, int currentIndex) {
        boolean isItUnique = true;
        for (int i = 0; i < currentIndex; i++) {
            if (uniqueWords[i].equalsIgnoreCase(word)) {
                isItUnique = false;
                break;
            }
        }
        return isItUnique;
    }

}
