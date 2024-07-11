package _11_interface.animal;

public class Main {

    static IBreathable[] breathAbles = new IBreathable[10];
    static int currentIndex = 0;

    public static void main(String[] args) {
        IBreathable animal = new Animal();
        IBreathable human = new Human();

        breathAbles[currentIndex++] = animal;
        breathAbles[currentIndex++] = human;

        for (int i = 0; i < currentIndex; i++) {
            breathAbles[i].breathe();
        }

        // TODO-interface-01
        // - Another another interface called
        //   ISing with the following method
        //   - sing()
        // - Have all concrete classes implement
        //   the newly added interface

        // TODO-interface-02
        // - Create Monkey class which both
        //   IBreathable and ISing interfaces

    }
}
