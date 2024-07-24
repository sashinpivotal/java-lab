package _08_organizating_java_classes._01_importing;

import java.util.logging.Logger;
import static java.util.logging.Level.INFO;

public class Account {

    private String name;
    private double balance;

    Logger logger = Logger.getLogger(getClass().getName());

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            // TODO-import-java-logging-01
            // - Refactor the System.out.printf(..) below using
            //   Java logging by doing some research
            Double[] arguments = new Double[2];
            arguments[0] = balance;
            arguments[1] = amount;
            logger.log(INFO,
                    "balance {0} is smaller than withdrawal amount {1}",
                    arguments);
        }
        balance -= amount;

    }

}
