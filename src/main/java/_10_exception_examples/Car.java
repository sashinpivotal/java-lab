package _10_exception_examples;

import java.sql.SQLException;

class Car {

    private String vin;

    public Car(String vin) {
        this.vin = vin;
    }

    public void moveTo(String location) throws SQLException, MyOwnCheckedException {
        if (location.equals("Mars")) {
            throw new IllegalArgumentException(
                    "Can't get to " + location
            );
        } else if (location.equals("Moon")) {
            throw new SQLException("Can't get to " + location);
        } else if (location.equals("Sun")) {
            throw new MyOwnCheckedException();
        } else {
            System.out.println("yes, you can go that " + location);
        }
    }
}
