package _12_junit_examples.simple;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    // TODO-04 - write testing code of the following method
    public String getUpperCasedPersonInfo() {
        String info = getName() + " is " + age + " years old.";
        return info.toUpperCase();
    }

    // TODO-05 - write testing code of the following method
    public String getLowerCasedPersonInfo() {
        String info = getName() + " is " + age + " years old.";
        return info.toLowerCase();
    }
}


