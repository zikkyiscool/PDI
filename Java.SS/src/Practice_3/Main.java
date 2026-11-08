package Practice_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employee: ");
        int n = sc.nextInt();
        sc.nextLine();

        if (n <= 0) {
            System.out.println("Number must be positive!");
            sc.close();
            return;
        }

        Employee employeeManagement = new Employee(n);

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of employee " + (i + 1));

            System.out.print("Employee ID: ");
            String employeeId = sc.nextLine();

            System.out.print("Employee name: ");
            String name = sc.nextLine();

            System.out.print("Basic Salary: ");
            double basicSalary = sc.nextDouble();
            sc.nextLine();

            Salary employee = new Salary(employeeId, name, basicSalary);
            employeeManagement.addEmployee(employee);
        }

        System.out.println("\n===== RESULTS =====");
        employeeManagement.displayAllEmployee();

        sc.close();
    }
}
