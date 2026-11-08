package Exercise_4;
public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(
            "101", "John", "Manager", 1500, "IT");
        Employee emp2 = new Employee(
            "507", "Vorn Bopha", "Saleswomen", 600, "Sale;");

        // Display employee information
        System.out.println("===== Employee Information =====");
        emp1.display();
        emp1.setSalary(1800);
        System.out.println("\nUpdated Salary: $" + emp1.getSalary());
        System.out.println("--------------------------------");

        emp2.display();
        emp2.setSalary(650);
        System.out.println("\nUpdated Salary: $" + emp2.getSalary());
        System.out.println("--------------------------------");
    }
}
