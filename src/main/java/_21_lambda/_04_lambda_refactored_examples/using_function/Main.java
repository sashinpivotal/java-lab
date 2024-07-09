package _21_lambda._04_lambda_refactored_examples.using_function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // Create test data
        Person[] personArray = {
                new Person("John", 5),
                new Person("Mary", 12),
                new Person("David", 17),
                new Person("Tom", 13)};
        List<Person> people = Arrays.asList(personArray);

        Fruit[] fruitArray = {
                new Fruit("Apple", 11),
                new Fruit("Orange", 22),
                new Fruit("Banana", 33)};
        List<Fruit> fruits = Arrays.asList(fruitArray);

        // #1: call methods which use a for loop
        convertPeopleUppercase(people);
        displayResult("---->#1a: ", people);
        convertPeopleLowercase(people);
        displayResult("---->#1b: ", people);

        // #2: call methods which use Function with specific type
        convertPeople(
                people,
                person -> {
                    person.setName(person.getName().toUpperCase());
                    return person;
                });
        displayResult("---->#2a: ", people);
        convertPeople(
                people,
                person -> {
                    person.setName(person.getName().toLowerCase());
                    return person;
                });
        displayResult("---->#2b: ", people);

        // #3: call methods which use Function with generic type
        Function<Person, Person> aFunction1 =
                person -> {
                    person.setName(person.getName().toUpperCase());
                    return person;
                };
        convert(people, aFunction1);
        displayResult("---->#3a: ", people);
        Function<Person, Person> aFunction2 =
                person -> {
                    person.setName(person.getName().toLowerCase());
                    return person;
                };
        displayResult("---->#3b: ", people);

        Function<Fruit, Fruit> aFunction3 =
                fruit -> {
                    fruit.setName(fruit.getName().toUpperCase());
                    return fruit;
                };
        convert(fruits, aFunction3);
        displayResult("---->#3a: ", fruits);
        Function<Fruit, Fruit> aFunction4 =
                fruit -> {
                    fruit.setName(fruit.getName().toLowerCase());
                    return fruit;
                };
        convert(fruits, aFunction4);
        displayResult("---->#3a: ", fruits);

        // #4: Use a stream
        Stream<Person> resultPeople1 =
                people.stream()
                        .map(person -> {
                            person.setName(person.getName().toUpperCase());
                            return person;
                        });
        resultPeople1.forEach(person -> System.out.print(person.getName() + " "));

        Stream<Person> resultPeople2 =
                people.stream()
                        .map(person -> {
                            person.setName(person.getName().toLowerCase());
                            return person;
                        });
        resultPeople2.forEach(person -> System.out.print(person.getName() + " "));

    }

    // #1: Uses a for loop
    public static void convertPeopleUppercase(List<Person> people) {
        for (Person p : people) {
            p.setName(p.getName().toUpperCase());
        }
    }

    public static void convertPeopleLowercase(List<Person> people) {
        for (Person p : people) {
            p.setName(p.getName().toLowerCase());
        }
    }

    // #2: Use predicate with specific type
    public static void convertPeople(List<Person> people, Function<Person, Person> aFunction) {
        for (Person p : people) {
            aFunction.apply(p);
        }
    }

    // #3: Use predicate with generic type
    public static <T, R> void convert(List<T> myList, Function<T, R> aFunction) {
        for (T t : myList) {
            aFunction.apply(t);
        }
    }

    // Utility method to display list of items
    public static <T> void displayResult(String prefix, List<T> results) {
        System.out.print(prefix);
        System.out.println(results);
    }


}
