package _01_classes_and_objects_examples;

public class Person {

    // fields
    private String name;
    private int age;

    // constructors
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // accessor methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // toString() overriding the one defined in the
    // Object class
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // business methods
    public String getPersonInfo() {
        return "name = " + name + ", age = " + age;
    }

}
