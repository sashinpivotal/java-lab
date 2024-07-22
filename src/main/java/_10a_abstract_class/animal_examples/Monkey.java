package _10a_abstract_class.animal_examples;

public class Monkey extends Animal{
    public Monkey(String name) {
        super(name);
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " breathe by Monkey");
    }

    @Override
    public void makeSound() {
        System.out.println("I am Monkey");
    }
}
