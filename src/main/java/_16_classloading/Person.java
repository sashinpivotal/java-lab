package _16_classloading;

public class Person {
}

class Main1 {
    public static void main(String[] args) {
        Person person = new Person();
        Class<? extends Person> aClass = person.getClass();
        String className = aClass.getName();
        System.out.println(className);
    }
}