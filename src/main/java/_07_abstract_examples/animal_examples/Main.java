package _07_abstract_examples.animal_examples;

public class Main {

    private static Animal[] animals = new Animal[100];
    private static int currentIndex = 0;

    public static void main(String[] args) {
        Cat cat1 = new Cat("jon");
        animals[currentIndex++] = cat1;
        Cat cat2 = new Cat("mary");
        animals[currentIndex++] = cat2;
        Dog dog1 = new Dog("chally");
        animals[currentIndex++] = dog1;
        Bird paul = new Bird("paul");
        animals[currentIndex++] = paul;
        AnimalHospital animalHospital = new AnimalHospital(animals, currentIndex);
        animalHospital.letAllAnimalsBreathe();
    }
}
