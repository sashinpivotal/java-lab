package _14_generics.why_generics.rawTypevsGenericType;

import java.util.ArrayList;

public class RawOrGeneric {
    public static void main(String[] args) {

        // We are not using generics
        ArrayList strings = new ArrayList();  // raw
        strings.add("xyz");
        strings.add(5);  // by accident, I added an integer
        String x = (String) strings.get(1);

        // Now we are using generics
        ArrayList<String> strings2 = new ArrayList<>();
        strings2.add("abc");
//        strings2.add(5);
    }
}
