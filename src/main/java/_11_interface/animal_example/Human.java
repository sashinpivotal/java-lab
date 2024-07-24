package _11_interface.animal_example;

public class Human implements IBreathable {
    @Override
    public void breathe() {
        System.out.println("A human breathed");
    }
}


