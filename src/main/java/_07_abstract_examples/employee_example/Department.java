package _07_abstract_examples.employee_example;

public class Department {

    private String departmentName;
    private Employee[] employees;
    private int currentIndex = 0;

    public Department(String departmentName, Employee[] employees) {
        this.departmentName = departmentName;
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        employees[currentIndex++] = employee;
    }

    public void listAllEmployees() {
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(employees[i].toString());
        }
    }

    public void payEmployees() {
        for (int i = 0; i < currentIndex; i++) {
            employees[i].pay();
        }
    }

}
