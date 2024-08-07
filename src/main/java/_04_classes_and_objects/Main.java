package _04_classes_and_objects;

public class Main {

    public static void main(String[] args) {

        // TODO-classes-and-objects-02
        // - Study the code below for creating a Person object
        //   using no-arg constructor
        //   then use setter methods to set values of
        //   the fields.
        Person person1 = new Person();
        person1.setName("David");
        person1.setAge(20);
        String personInfo1 = person1.getPersonInfo();
        System.out.println(personInfo1);

        // TODO-classes-and-objects-03
        // - Study the code below for creating a  Person object
        //   using a constructor with arguments
        Person person2 = new Person("Cindy", 32);
        String personInfo2 = person2.getPersonInfo();
        System.out.println(personInfo2);

        // TODO-classes-and-objects-04
        // - Create "Account" class with the following
        //   fields with appropriate types
        //   - name
        //   - balance
        // - Add proper constructors
        // - Add proper accessor methods
        // - Override toString() method
        // - Add the following two business methods with proper
        //   arguments and return types
        //   - deposit(..)
        //   - withdraw(..)
        // - Create 2 instances of "Account" objects
        //   (we will call them as account1, account2)
        //   with appropriate initial values
        // - Display both accounts
        // - Withdraw $30 from account1 and deposit
        //   the same amount into account2
        // - Make sure the withdrawal is possible
        //   only when the balance is greater than
        //   the amount of withdrawal
        //   - when balance is less than the amount
        //   - just return - no need to throw an
        //     exception for now
        // - Display both accounts before and after
        //   the withdrawal and deposit operations
        // - Make sure both accounts
        //   have the correct balances

    }
}