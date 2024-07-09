package _10_exception_examples;

import java.sql.SQLException;

class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void goToWork() throws MyOwnCheckedException {
        Car c = new Car("ABC123");
        try {
            c.moveTo("Moon");
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println(illegalArgumentException.getMessage());
            throw new TrafficIsHeavyRuntimeException("my business level exception message");
        } catch (SQLException sqlException) {
            System.out.println(sqlException.getMessage());
        } catch (Exception e) {
            System.out.println("general exception catch");
        }
        System.out.println("Arrived at work");
    }
}
