package _11_interface.animal_example;

// TODO-interface-02
// - Observe that the Animal and Human classes are
//   implementation classes that implements
//   IBreathable interface
public class Animal implements IBreathable {
    @Override
    public void breathe() {
        System.out.println("An animal_example breathed");
    }
}
