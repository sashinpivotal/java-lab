package _07_more_on_classes._03_overloaded_methods;

public class Account {
    private String name;
    private double balance;

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

    public void withdraw(double amount) {
        if (balance < amount) {
            return;
        }
        balance -= amount;
    }

    public void withdraw(String amount) {
        double convertedAmount = Double.parseDouble(amount);
        if (balance < Double.parseDouble(amount)) {
            return;
        }
        balance -= convertedAmount;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void deposit(String amount) {
        double convertedAmount = Double.parseDouble(amount);
        if (convertedAmount > 0) {
            balance += convertedAmount;
        }
    }
}
