package _11_interface.employee_example;

import java.time.LocalDate;

public abstract class Employee {

    private String name;
    private LocalDate hireDate;

    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    // abstract methods
    public abstract double computeCompensation();

}
