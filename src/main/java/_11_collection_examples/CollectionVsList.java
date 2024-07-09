package _11_collection_examples;

import java.util.*;

public class CollectionVsList {
    public static void main(String[] args) {

        ArrayList<String> strings1 = new ArrayList<>(); // choice #1
        List<String> strings2 = new ArrayList<>();      // choice #2
        Collection<String> strings3 = new ArrayList<>();// choice #3

        // reasons to choose choice #3
        // - if your operations involves only the methods
        //   available in Collection
        strings3.add("sang");
        int size = strings3.size();

        // reasons to choose choice #2
        // - List interface provides more methods to deal with
        strings2.set(2, "kiaya");
        someMethod1(strings2);
    }

    public static void someMethod1(List<String> myArgument) {
        myArgument.get(2);
    }

    public static void someMethod2(Collection<String> myArgument) {
    }
}
