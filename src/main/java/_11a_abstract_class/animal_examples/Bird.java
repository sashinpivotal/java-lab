package _10a_abstract_class.animal_examples;

class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " breathe by Bird");
    }
}
