package _11_interface.animal;

public class Human implements IBreathable {
    @Override
    public void breathe() {
        System.out.println("A human breathed");
    }
}


