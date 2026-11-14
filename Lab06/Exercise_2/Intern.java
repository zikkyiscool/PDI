package Exercise_2;

public class Intern extends Employee {
    Intern(String name, double salary) {
        super(name, salary);
    }

    @Override 
    public double calculate_bonus(){
        return salary * 0.05;
    }
}
