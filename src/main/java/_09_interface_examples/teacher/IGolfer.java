package _09_interface_examples.teacher;

interface IGolfer {
    void playGolf();

    default void myDefaultMethod() {
        System.out.println("Yo I am default Method");
    }
}
