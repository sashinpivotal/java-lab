package _11_interface.animal;

public class Monkey implements IBreathable{
    @Override
    public void breathe() {
        System.out.println("A monkey breathed");
    }
}
