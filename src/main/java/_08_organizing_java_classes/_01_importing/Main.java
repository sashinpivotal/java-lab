package _08_organizing_java_classes._01_importing;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("sang", 1000.0);
        account.withdraw(2000.0);
    }
}
