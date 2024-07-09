package _09_interface.animal;

public class Animal implements IBreathable {
    @Override
    public void breathe() {
        System.out.println("An animal breathed");
    }
}
