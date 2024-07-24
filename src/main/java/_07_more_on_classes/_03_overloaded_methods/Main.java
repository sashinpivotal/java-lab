package _07_more_on_classes._03_overloaded_methods;

public class Main {
    public static void main(String[] args) {

        // TODO-overloaded-methods-01
        // - Create a class called Account with the following
        //   fields
        //   - name
        //   - balance
        // - Add overloaded methods to Account class
        //   with method names like
        //   deposit(..) and withdraw(..) which can take
        //   either double type value in one method or
        //   String of double value like "2000.0"
        // - Create account1 and account2 object instances
        // - Write logic of withdrawing some amount
        //   of money from account1 and deposit to
        //   account2 in this main method
        Account account1 = new Account("sang", 1000.0);
        Account account2 = new Account("tom", 2000.0);
        account1.withdraw("50.0");
        account2.deposit(50.0);
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
    }
}
