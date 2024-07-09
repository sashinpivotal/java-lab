package _06_inheritance_example.employee_example;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {

    private String name;
    private LocalDate hireDate;

    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    public  void pay(){
        System.out.println("pay by Employee");
    };

    public  void someMethod(){
        System.out.println("someMethod by Employee");
    };

    public Object someMethod(String x, int y) {
        return null;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hireDate=" + hireDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(hireDate, employee.hireDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hireDate);
    }

}
