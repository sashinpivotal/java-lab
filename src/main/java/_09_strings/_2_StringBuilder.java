package _09_strings;

public class _2_StringBuilder {
    public static void main(String[] args) {

        // TODO-StringBuilder-01
        // - Create a StringBuilder, append some strings,
        //   and print the result.
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Hello ");
        stringBuffer.append("World!");
        String message = stringBuffer.toString();
        System.out.println(message);

        // TODO-StringBuilder-02
        // - Insert a string at a specific position
        //   in the StringBuilder and print the result.
        stringBuffer.insert(6, "Beautiful ");
        message = stringBuffer.toString();
        System.out.println(message);

        // TODO-StringBuilder-03
        // - Delete a part of the StringBuilder
        //   and print the result.
        stringBuffer.delete(6, 16);
        message = stringBuffer.toString();
        System.out.println(message);

    }
}




























/*
        // Exercise 1: Create a StringBuilder, append some strings, and print the result.
        StringBuilder sb = new StringBuilder();
        sb.append("Hello, ");
        sb.append("World!");
        System.out.println("StringBuilder result: " + sb.toString());

        // Exercise 2: Insert a string at a specific position in the StringBuilder and print the result.
        sb.insert(7, "beautiful ");
        System.out.println("After insert: " + sb.toString());

        // Exercise 3: Delete a part of the StringBuilder and print the result.
        sb.delete(7, 17);
        System.out.println("After delete: " + sb.toString());
 */