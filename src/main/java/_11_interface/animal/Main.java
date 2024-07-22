package _11_interface.animal;

public class Main {

    static IBreathable[] breathAbles = new IBreathable[10];
    static int currentIndex = 0;

    public static void main(String[] args) {
        IBreathable animal = new Animal();
        IBreathable human = new Human();

        breathAbles[currentIndex++] = animal;
        breathAbles[currentIndex++] = human;

        // TODO-interface-03
        // - Create Monkey class which implements
        //   IBreathable interface

        for (int i = 0; i < currentIndex; i++) {
            breathAbles[i].breathe();
        }

    }
}
