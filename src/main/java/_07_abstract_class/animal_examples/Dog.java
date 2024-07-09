package _07_abstract_class.animal_examples;

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " breathe by Dog");
    }

}
