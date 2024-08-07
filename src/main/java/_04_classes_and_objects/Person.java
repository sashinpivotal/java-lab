package _04_classes_and_objects;

// TODO-classes-and-objects-01
// - Study the Person class below, which has
//   the following parts
//   - Fields
//   - Constructors
//   - Accessor methods
//   - toString method
//   - Business methods
public class Person {

    // Fields
    private String name;
    private int age;

    // Constructors
    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }

    // Accessor methods
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

    // Business methods
    public String getPersonInfo() {
        return "name = " + name + ", age = " + age;
    }

}
