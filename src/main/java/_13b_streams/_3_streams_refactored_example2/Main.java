package _13b_streams._3_streams_refactored_example2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    // TODO-streams-05a
    // - Let's say we want to write code to perform:
    //   the following:
    // (1) find all transactions of type Grocery and
    // (2) return a list of transaction IDs
    // (3) sorted in decreasing order of transaction value
    public static void main(String[] args) {

        // Create test data
        List<Transaction> transactions = Arrays.asList(
                new Transaction(1, TransactionType.GROCERY, 100),
                new Transaction(2, TransactionType.DESK, 300),
                new Transaction(3, TransactionType.GROCERY, 250),
                new Transaction(4, TransactionType.GROCERY, 150),
                new Transaction(5, TransactionType.CHAIR, 80));

        System.out.println("---- Non-stream (External iteration) operation ----");
        List<Integer> transactionIds = getGroceryTransactionIdsNotUsingStream(transactions);
        transactionIds.forEach(id -> System.out.println("transaction id = " + id));

        System.out.println("---- Stream (Internal iteration) operation ----");
        transactionIds = getGroceryTransactionIdsUsingStream(transactions);
        transactionIds.forEach(id -> System.out.println("transaction id = " + id));

        // TODO-streams-05d:
        // - Create Product, which has Integer productId,
        //   ProductType productType, and Integer price fields
        // - Create ProductType as a enum, which has BOOK,
        //   ELECTRONICS, FOOD as possible values
        // - Add appropriate initial test data
        // - Using stream, get a list of Product Id's of the
        //   ELECTRONICS reverse sorted on the price

    }

    // TODO-streams-05b:
    // - Study how tedious/under-performing the code can
    //   be if you are NOT using Stream as shown below:
    //
    // Non-stream operation (external iteration)
    //
    private static List<Integer>
    getGroceryTransactionIdsNotUsingStream(List<Transaction> transactions) {

        List<Transaction> groceryTransactions = new ArrayList<>();
        for (Transaction t : transactions) {
            if (t.getTransactionType().equals(TransactionType.GROCERY)) {
                groceryTransactions.add(t);
            }
        }

        Collections.sort(groceryTransactions, new Comparator<Transaction>() {
            public int compare(Transaction t1, Transaction t2) {

                return t2.getValue().compareTo(t1.getValue());
            }
        });

        List<Integer> transactionIds = new ArrayList<>();
        for (Transaction t : groceryTransactions) {
            transactionIds.add(t.getId());
        }

        return transactionIds;
    }

    // TODO-streams-05c:
    // - Study how simple the code can
    //   be if you ARE using Stream as shown below:
    //
    // Stream operation (internal iteration)
    //
    private static List<Integer>
    getGroceryTransactionIdsUsingStream(List<Transaction> transactions) {

        return transactions
                .parallelStream()
                .filter(transaction
                        -> transaction.getTransactionType().equals(TransactionType.GROCERY))
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .map(Transaction::getId)
                .collect(Collectors.toList());

    }

}
