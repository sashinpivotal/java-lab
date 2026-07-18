package _10a_abstract_class.animal_examples;

// TODO-abstract-class-01
// - Observe that the Animal class below is an
//   abstract class with an abstract method
// - Note that an abstract class can have
//   its own constructor methods
// - Add another abstract method below
//   - makeSound()
public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    // abstract methods
    public abstract void breathe();
    public abstract void makeSound();
}

