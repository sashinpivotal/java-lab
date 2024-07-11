package _10a_abstract_class.employee_example;

import java.time.LocalDate;
import java.util.Objects;

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
