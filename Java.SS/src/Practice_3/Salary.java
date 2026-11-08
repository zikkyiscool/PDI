package Practice_3;

public class Salary {
    private String employeeId;
    private String name;
    private double basicSalary;

    // Constructor
    public Salary(String employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Getters
    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    //Calculate for Gross Salary
    //Gross Salary = basic Salary + HRA(20% basic) + TCA(10% basic)
    public double getGrossSalary() {
        return (basicSalary+ (0.2*basicSalary) + (0.1*basicSalary));
    }

    // Display one employee information
    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee's name: " + name);
        System.out.printf("Basic Salary: $%.2f%n", basicSalary);
        System.out.printf("Gross Salary: $%.2f%n", getGrossSalary());;
        System.out.println("-------------------");
    }
}
