package _11_collection_examples;

import java.util.ArrayList;

public class Person  implements Comparable<Person>{

    int age;

    public Person(int age) {
        setAge(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        int returnInt = 0;
        if (this.age > person.getAge()) {
            returnInt = 1;
        } else if (this.age < person.getAge()) {
            returnInt = -1;
        }
        return returnInt;


    }
}

class Main {

    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        Person person10 = new Person(10);
        Person person6 = new Person(6);

        people.add(person10);
        people.add(person6);
        System.out.println(people);

        int i = person6.compareTo(person6);
        System.out.println(i);

    }
}