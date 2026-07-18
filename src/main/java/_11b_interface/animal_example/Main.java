package _11_interface.animal_example;

public class Main {

    static IBreathable[] breathAbles = new IBreathable[10];
    static int currentIndex = 0;

    public static void main(String[] args) {
        IBreathable animal = new Animal();
        IBreathable human = new Human();

        breathAbles[currentIndex++] = animal;
        breathAbles[currentIndex++] = human;

        // TODO-interface-03
        // - Write Monkey class which implements
        //   IBreathable interface
        // - Create an monkey object and
        //   add it to the breathAbles array

        for (int i = 0; i < currentIndex; i++) {
            breathAbles[i].breathe();
        }

    }
}
