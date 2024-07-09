package _09_interface_examples.inheritance;

public interface IFatherInterface {
    void fatherMethod();

    default void dMethod1() {
        System.out.println("dMethod1 from interface");
    }

    default void dMethod2() {
        System.out.println("dMethod2 from interface");
    }

    static void myStaticMethod() {
        System.out.println("static method inside interface");
    }
}


