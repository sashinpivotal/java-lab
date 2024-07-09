package _22_optional;

import java.util.Locale;
import java.util.Optional;

class Main {
    public static void main(String[] args) {
        SomeClass aObject = new SomeClass();
        String string = aObject.someMethod();

        // If SomeClass has a method that could
        // return null, the caller has to
        // check if the returned object is null
        // or not in order to avoid NullPointerException.
        // But developer could easily forget to
        // do this check, which could result in
        // runtime exception.
        if (string != null) {
            String s = string.toUpperCase(Locale.ROOT);
        }

        // If the method returns Optional, the caller
        // is forced to make the check at compile time.
        Optional<String> optionalS = aObject.someMethod2();
        if (optionalS.isPresent()) {
            String s = optionalS.get();
        }

    }
}
