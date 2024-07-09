package _14_generics.why_generics.genericMethod;

import java.util.List;

public class GenericMethodClass {

    // T is a regular type - see class T below
    static List<T> nCopies1(int n, T item) {
        return null;
    }

    // T is a type parameter of generics
    static <T> List<T> nCopies2(int n, T item) {
        return null;
    }

}

class T {
}
