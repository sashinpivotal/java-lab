package _08_organizating_java_classes._02_maven_dependency;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("sang", 1000.0);
        account.withdraw(2000.0);
    }
}
