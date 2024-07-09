package _21_lambda._04_lambda_refactored_examples.using_predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // Create test data
        Person[] personArray = {
                new Person("Jong", 5),
                new Person("Jon", 12),
                new Person("Jon", 17),
                new Person("Mary", 13)};
        List<Person> people = Arrays.asList(personArray);

        Fruit[] fruitArray = {
                new Fruit("Apple", 11),
                new Fruit("Orange", 22),
                new Fruit("Banana", 33)};
        List<Fruit> fruits = Arrays.asList(fruitArray);

        // #1: call methods which use a for loop
        List<Person> peopleResult = findPeopleByName(people, "Jon");
        displayResult("---->#1a: ", peopleResult);
        peopleResult = findPeopleByAge(people, 10);
        displayResult("---->#1b: ", peopleResult);

        // #2: call methods which use predicate with specific type
        peopleResult = finePeople(people,
                person -> person.getName().equals("Jon"));
        displayResult("---->#2a: ", peopleResult);
        peopleResult = finePeople(people,
                person -> person.getAge() > 10);
        displayResult("---->#2b: ", peopleResult);
        peopleResult = finePeople(people,
                person -> person.getName().startsWith("J")
                        && person.getAge() > 10);
        displayResult("---->#2c: ", peopleResult);

        // #3: call methods which use predicate with generic type
        peopleResult = find(people,
                person -> person.getName().equals("Jon"));
        displayResult("---->#3a: ", peopleResult);
        peopleResult = find(people,
                person -> person.getAge() > 10);
        displayResult("---->#3b: ", peopleResult);
        peopleResult = find(people,
                person -> person.getName().startsWith("J")
                        && person.getAge() > 10);
        displayResult("---->#3c: ", peopleResult);

        List<Fruit> fruitResult = find(fruits,
                fruit -> fruit.getName().equals("Apple"));
        displayResult("---->#3d: ", fruitResult);
        int xyz = 20;
        fruitResult = find(fruits, fruit -> fruit.getQuantity() > 10);
        displayResult("---->#3e: ", fruitResult);
        fruitResult = find(fruits, fruit -> fruit.getName()
                .startsWith("A") && fruit.getQuantity() > 10);
        displayResult("---->#3f: ", fruitResult);

        // #4: Use a stream
        Stream<Person> resultPeople = people.stream()
                .filter(person -> person.getAge() > 10);
        System.out.print("---->#4a: ");
        resultPeople.forEach(person -> System.out.print(person.getName() + " "));

        Stream<Fruit> resultFruits = fruits.stream()
                .filter(fruit -> fruit.getQuantity() > 10);
        System.out.print("\n---->#4b: ");
        resultFruits.forEach(fruit -> System.out.print(fruit.getName() + " "));

    }

    // #1: Uses a for loop
    public static List<Person> findPeopleByName(List<Person> people,
                                                String name) {

        List<Person> result = new ArrayList<>();
        for (Person p : people) {
            if (p.getName().equals(name)) {
                result.add(p);
            }
        }
        return result;
    }

    public static List<Person> findPeopleByAge(List<Person> people,
                                               int age) {

        List<Person> result = new ArrayList<>();
        for (Person p : people) {
            if (p.getAge() > 10) {
                result.add(p);
            }
        }
        return result;
    }

    // #2: Use Predicate with specific type
    public static List<Person> finePeople(List<Person> people,
                                          Predicate<Person> aPredicate) {

        List<Person> result = new ArrayList<Person>();
        for (Person p : people) {
            if (aPredicate.test(p)) {
                result.add(p);
            }
        }
        return result;
    }

    // #3: Use Predicate with generic type
    public static <T> List<T> find(List<T> myList, Predicate<T> aPredicate) {

        List<T> result = new ArrayList<T>();
        for (T item : myList) {
            if (aPredicate.test(item)) {
                result.add(item);
            }
        }
        return result;
    }

    // Utility method to display list of items
    public static <T> void displayResult(String prefix, List<T> results) {
        System.out.print(prefix);
        System.out.println(results);
    }

}
