package _06_arrays;

import java.util.Arrays;

public class _4_ArrayOfAccount {

    public static void main(String[] args) {

        // TODO-arrays-09
        // - Create an array of "Account" objects of size 10
        //   - The Account class has "name" and "balance" fields
        // - Create 3 "Account" objects and add them to
        //   the array
        // - Compute the total amount and average amount
        //   of the balances of these 3 accounts and display them
        Account[] arrayOfAccounts = new Account[10];
        Account sang = new Account("sang", 1000.0);
        Account joe = new Account("joe", 2000.0);
        Account tom = new Account("tom", 3000.0);
        arrayOfAccounts[0] = sang;
        arrayOfAccounts[1] = joe;
        arrayOfAccounts[2] = tom;

        double totalAmount = 0.0;
        double averageAmount = 0.0;
        int numberOfValidAccounts = 0;
        for (int i = 0; i < arrayOfAccounts.length; i++) {
            if (arrayOfAccounts[i] != null) {
                totalAmount += arrayOfAccounts[i].getBalance();
                numberOfValidAccounts++;
            }
        }
        averageAmount = totalAmount / numberOfValidAccounts;
        System.out.println("total amount = " + totalAmount);
        System.out.println("average amount = " + averageAmount);

    }
}
