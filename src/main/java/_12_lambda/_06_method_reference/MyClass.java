package _12_lambda._06_method_reference;

// TODO-method-reference-01
// - Study the following code reading the comments

// Let's say you have defined a functional
// interface @FunctionalInterface
interface MyFunctionalInterface {
    public void mySingleAbstractMethod(String name, int age);

}

// Let's also assume there is an existing
// static method in a class
public class MyClass {
    public static void existingStaticMethod(String name, int age) {
        System.out.println(name + " is " + age + " years old.");
    }
}

class Main {
    public static void main(String[] args) {

        // You would write a lambda expression as following
        // if you want to use the existing static method of the class
        MyFunctionalInterface myObject2
                = (name, age) -> MyClass.existingStaticMethod(name, age);
        myObject2.mySingleAbstractMethod("Jon", 77);

        // The above lambda expression can be rewritten
        // using a static method reference
        MyFunctionalInterface myObject3
                = MyClass::existingStaticMethod;
        myObject3.mySingleAbstractMethod("Jon", 66);
    }
}
