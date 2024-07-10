package _16_exception_handling;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException, MyOwnCheckedException {
        Employee employee = new Employee("Jason");
        employee.goToWork();
        System.out.println("Done");
    }

}

