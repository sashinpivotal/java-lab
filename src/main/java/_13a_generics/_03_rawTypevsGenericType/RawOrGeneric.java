package _13a_generics._03_rawTypevsGenericType;

import java.util.ArrayList;

public class RawOrGeneric {
    public static void main(String[] args) {

        // We are not using generics
        ArrayList strings = new ArrayList();  // raw
        strings.add("xyz");
        strings.add(5);  // by accident, I added an integer
        // The following code will cause ClassCastException
        // when executed.  We want to find this problem
        // at compile time.
        String x = (String) strings.get(1);

        // Now we are using generics
        ArrayList<String> strings2 = new ArrayList<>();
        strings2.add("abc");
//        strings2.add(5);   // compile error
    }
}
