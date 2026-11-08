package Exercise_4;
public class Employee {

    //Attributes
    private String id;
    private String name;
    private String position;
    private double salary;
    private String department;

    // Constructor
    public Employee(String id, String name, String position,
                    double salary, String department) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.department = department;
    }

    // Getter methods
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    //Setter methods
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    //Display employee information
    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Salary: $" + salary);
        System.out.println("Department: " + department);
    }
}
