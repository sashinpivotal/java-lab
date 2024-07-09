package _11_collection_examples;

import java.util.ArrayList;
import java.util.List;

public class ImmutableList {
    public static void main(String[] args) {
        List<String> stringList = List.of("david", "shawn", "tom");
        ArrayList<String> arrayList = new ArrayList<>(stringList);
        arrayList.add("bryce");
        System.out.println(arrayList);
    }
}
