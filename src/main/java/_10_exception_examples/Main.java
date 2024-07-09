package _10_exception_examples;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException, MyOwnCheckedException {
        Employee employee = new Employee("Jason");
        employee.goToWork();
        System.out.println("Done");
    }

}

