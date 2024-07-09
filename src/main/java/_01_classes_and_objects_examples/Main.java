package _01_classes_and_objects_examples;

public class Main {

    public static void main(String[] args) {

        // Create Person object using no-arg constructor
        Person person1 = new Person();
        person1.setName("David");
        person1.setAge(20);
        String personInfo1 = person1.getPersonInfo();
        System.out.println(personInfo1);

        // Create Person object using a constructor
        // with arguments
        Person person2 = new Person("Cindy", 32);
        String personInfo = person2.getPersonInfo();
        System.out.println(personInfo);

    }
}
