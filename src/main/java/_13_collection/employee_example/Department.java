package _13_collection.employee_example;

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

    public double computeDepartmentTotalMonthlyCompensation() {
        double departmentTotalMonthlyCompensation = 0.0;
        for (int i = 0; i < currentIndex; i++) {
            departmentTotalMonthlyCompensation
                    += employees[i].computeCompensation();
        }
        return departmentTotalMonthlyCompensation;
    }

}
