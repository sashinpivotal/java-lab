package _10a_abstract_class.animal_examples;

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " breathe by Cat");
    }

    @Override
    public void makeSound() {
        System.out.println("Meo");
    }

}
