package _13_collection.employee_example;

import java.util.List;

public class Department {

    private String departmentName;
    private List<Employee> employees;

    public Department(String departmentName, List<Employee> employees) {
        this.departmentName = departmentName;
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public double computeDepartmentTotalMonthlyCompensation() {
        double departmentTotalMonthlyCompensation = 0.0;
        for (Employee employee: employees) {
            departmentTotalMonthlyCompensation
                    += employee.computeCompensation();
        }
        return departmentTotalMonthlyCompensation;
    }

}
