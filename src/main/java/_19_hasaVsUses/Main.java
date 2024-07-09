package _19_hasaVsUses;

import _19_hasaVsUses.uses.Computer;
import _19_hasaVsUses.uses.Person;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        Computer computer = new Computer();
        person.useComputer(computer);
    }
}
