package Exercise_2;

public class Main {
    public static void main(String[]args){

        Employee e1 = new Employee("Dara", 550);
        Employee e2 = new Manager("Sok", 1000);
        Employee e3 = new Intern("Roth",200);

        System.out.println("=======Employee List=======");
        System.out.println("Name: " + e1.name);
        System.out.println("Position: Normal employee");
        System.out.println("Salary: " + e1.salary);
        System.out.println("Bonus: " + e1.calculate_bonus());
        System.out.println("---------------------------");

        System.out.println("Name: " + e2.name);
        System.out.println("Position: Manager");
        System.out.println("Salary: " + e2.salary);
        System.out.println("Bonus: " + e2.calculate_bonus());
        System.out.println("---------------------------");

        System.out.println("Name: " + e3.name);
        System.out.println("Position: Intern");
        System.out.println("Salary: " + e3.salary);
        System.out.println("Bonus: " + e3.calculate_bonus());
        System.out.println("---------------------------");
    }
    
}
