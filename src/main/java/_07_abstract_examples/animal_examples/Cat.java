package _07_abstract_examples.animal_examples;

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " breathe by Cat");
    }

}
