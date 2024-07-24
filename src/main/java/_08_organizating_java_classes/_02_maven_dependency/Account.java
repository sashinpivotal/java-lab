package _08_organizating_java_classes._02_maven_dependency;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Account {

    private String name;
    private double balance;

    private final Logger logger
            = LogManager.getLogger(getClass().getName());

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
            // TODO-java-logging-02
            // - Refactor the System.out.printf(..) below using
            //   Log4J (instead of Java logging from JDK)
            //   - You will have to add Log4J Maven dependency
            //     to pom.xml
            //   - Once you change pom.xml, make sure to
            //     refresh Maven (click Maven icon on the top
            //     right corner in the editor window)
            //     in order to trigger the downloading the
            //     Log4J dependency to local Maven repository.
//            System.out.printf(
//                    "balance %.2f is smaller than withdrawal amount %.2f"
//                    , balance, amount);
            logger.error("balance is smaller than withdrawal amount");
        }
        balance -= amount;

    }

}