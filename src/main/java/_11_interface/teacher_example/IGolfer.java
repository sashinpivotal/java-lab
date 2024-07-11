package _11_interface.teacher_example;

interface IGolfer {
    void playGolf();

    default void myDefaultMethod() {
        System.out.println("Yo I am default Method");
    }
}
