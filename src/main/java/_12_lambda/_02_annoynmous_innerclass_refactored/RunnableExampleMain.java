package _12_lambda._02_annoynmous_innerclass_refactored;

public class RunnableExampleMain {
    public static void main(String[] args) {

        // TODO-lambda-anonymous-02a:
        // - Study the Anonymous inner class Runnable is
        //   used below (not using Lambda)
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world one!");
            }
        };
        r1.run();

        // TODO-lambda-anonymous-02b:
        // - Rewrite the code above using Lambda


    }
}
