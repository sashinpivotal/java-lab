package _11_collection_examples;

import _06_inheritance_example.employee_example.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListExample {

    static private List<Employee> myCollection
            = new ArrayList<>();

    static private List myCollectionNotUsingGenerics
            = new ArrayList();

    static private List<String> names
            = new ArrayList<>();

    public static void main(String[] args) {

        var integers = new ArrayList<Integer>();

        myCollection.add(
                new Employee("sang",
                        LocalDate.of(1990, 1, 3))
        );

        // compile error
        // myCollection.add(new String("hello"));

        myCollectionNotUsingGenerics.add(
                new String("test"));
//        Employee employee = (Employee) myCollectionNotUsingGenerics.get(0);

        names.add("Amy");  // index = 0
        names.add("Tom");  // index = 1
        System.out.println(names);

        names.add(1, "Bobby");
        System.out.println(names);
        names.set(2, "david");
        System.out.println(names);

        String name = names.get(0);
        System.out.println(name);

        names.add("Amy");
        System.out.println(names);

        System.out.println(names.size());
    }

}
