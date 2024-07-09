package _09_interface_examples.animal;

public class Main {

    static IBreathable[] breathables = new IBreathable[10];
    static int currentIndex = 0;

    public static void main(String[] args) {
        IBreathable animal = new Animal();
        IBreathable human = new Human();

        breathables[currentIndex++] = animal;
        breathables[currentIndex++] = human;

        for (int i = 0; i < currentIndex; i++) {
            breathables[i].breathe();
        }

    }
}
