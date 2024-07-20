package _04_classes_and_objects;

public class Main {

    public static void main(String[] args) {

        // Create Person object using no-arg constructor
        // then use setter methods to set values of
        // the fields.
        Person person1 = new Person();
        person1.setName("David");
        person1.setAge(20);
        String personInfo1 = person1.getPersonInfo();
        System.out.println(personInfo1);

        // Create Person object using a constructor
        // with arguments
        Person person2 = new Person("Cindy", 32);
        String personInfo2 = person2.getPersonInfo();
        System.out.println(personInfo2);

        // TODO-classes-and-objects-01
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
        // - Display both accounts and make sure
        //   the resulting balances of both accounts
        //   reflect the correct balances

    }
}
