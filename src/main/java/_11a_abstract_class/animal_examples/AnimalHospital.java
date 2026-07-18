package _10a_abstract_class.animal_examples;

class AnimalHospital {

    Animal[] animals;
    int numberOfValidAnimals;

    public AnimalHospital(Animal[] animals, int numberOfValidAnimals) {
        this.animals = animals;
        this.numberOfValidAnimals = numberOfValidAnimals;
    }

    public void letAllAnimalsBreathe() {
        for (int i = 0; i < numberOfValidAnimals; i++) {
            animals[i].breathe();
        }
    }

    public void letAllAnimalsMakeSound() {
        for (int i = 0; i < numberOfValidAnimals; i++) {
            animals[i].makeSound();
        }
    }
}
