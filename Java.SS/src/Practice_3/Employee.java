package Practice_3;

public class Employee {
    private Salary[] employees;
    private int count;

    // Constructor
    public Employee(int size) {
        employees = new Salary[size];
        count = 0;
    }

    // Add an employee
    public void addEmployee(Salary employee) {
        if (count < employees.length) {
            employees[count] = employee;
            count++;
        } else {
            System.out.println("Employee list is full!");
        }
    }

    // Display all Employee
    public void displayAllEmployee() {
        for (int i = 0; i < count; i++) {
            employees[i].displayEmployee();
        }
    }
}
