package _09_interface_examples.animal;

public class Human implements IBreathable {
    @Override
    public void breathe() {
        System.out.println("A human breathed");
    }
}


