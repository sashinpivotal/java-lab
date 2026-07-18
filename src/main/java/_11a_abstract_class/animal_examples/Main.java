package _10a_abstract_class.animal_examples;

public class Main {

    private static Animal[] animals = new Animal[100];
    private static int currentIndex = 0;

    public static void main(String[] args) {

        Cat cat1 = new Cat("jon");
        animals[currentIndex++] = cat1;
        Cat cat2 = new Cat("mary");
        animals[currentIndex++] = cat2;
        Dog dog1 = new Dog("tom");
        animals[currentIndex++] = dog1;
        Bird paul = new Bird("paul");
        animals[currentIndex++] = paul;

        AnimalHospital animalHospital = new AnimalHospital(animals, currentIndex);
        animalHospital.letAllAnimalsBreathe();

        // TODO-abstract-class-02
        // - Have all concrete classes implement
        //   the newly added abstract method
        //   as following
        //   - Dog makes "Yo" sound
        //   - Cat makes "Meo" sound
        //   - Bird makes "ChitChit" sound
        // - Add the following method in the
        //   AnimalHospital class
        //   - letAllAnimalsMakeSound()
        // - Invoke letAllAnimalsMakeSound() method
        //   in this main method
        animalHospital.letAllAnimalsMakeSound();

        // TODO-abstract-class-03
        // - Create Monkey class which extends
        //   Animal abstract class
        Monkey zara = new Monkey("zara");
        animals[currentIndex++] = zara;

    }
}
