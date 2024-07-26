package _12_lambda._04_lambda_refactored_examples._02_using_function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // Create test data
        Person[] personArray = {
                new Person("John", 5),
                new Person("MARY", 12),
                new Person("David", 17),
                new Person("TOM", 13)};
        List<Person> people = Arrays.asList(personArray);

        Fruit[] fruitArray = {
                new Fruit("Apple", 11),
                new Fruit("Orange", 22),
                new Fruit("Banana", 33)};
        List<Fruit> fruits = Arrays.asList(fruitArray);

        Sport[] sportArray = {
                new Sport("football"),
                new Sport("swimming"),
                new Sport("baseball")
        };
        List<Sport> sports = Arrays.asList(sportArray);

        // TODO-lambda-refactored-01:
        // - Study the 4 different ways from least
        //   desirable approach to the most below
        // #1: call methods which use a for loop (least desired)
        // #2: call methods which use Function with specific type
        // #3: call methods which use Function with generic type
        // #4: Use a stream

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
        // TODO-lambda-refactor-04
        // - Write code to convert the name of a person to
        //   CamelCase using convertPeople method
        convertPeople(people,
                person -> {
                    String camelCaseName
                            = person.getName().substring(0, 1).toUpperCase() +
                              person.getName().substring(1).toLowerCase();
                    person.setName(camelCaseName);
                    return person;
                });
        displayResult("solution--> ", people);

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
        // TODO-lambda-refactor-05
        // - Create an array of Sport type, which has
        //   the following fields
        //      - name (i.e. "football", "swimming", "baseball")
        // - Write code to convert the name of sport
        //   to CamelCase using convert method
        Function<Sport, Sport> aFunction5 =
                sport ->{
                    String camelCaseName
                            = sport.getName().substring(0, 1).toUpperCase() +
                            sport.getName().substring(1).toLowerCase();
                    sport.setName(camelCaseName);
                    return sport;
                };
        convert(sports, aFunction5);
        displayResult("solution--> ", sports);

        // #4: Use a stream
        Stream<Person> resultPeople1 =
                people.stream()
                        .map(person -> {
                            person.setName(person.getName().toUpperCase());
                            return person;
                        });
        resultPeople1.forEach(person -> System.out.print(person.getName() + " "));
        System.out.println();

        Stream<Person> resultPeople2 =
                people.stream()
                        .map(person -> {
                            person.setName(person.getName().toLowerCase());
                            return person;
                        });
        resultPeople2.forEach(person -> System.out.print(person.getName() + " "));
        System.out.println();

        // TODO-lambda-refactor-06
        // - Write code to convert the name of sport
        //   to CamelCase using stream
        sports.stream()
                .map(aFunction5)
                .forEach(sport -> System.out.print(sport.getName() + " "));

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
