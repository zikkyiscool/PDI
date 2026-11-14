package Exercise_2;

public class Manager extends Employee{
    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override 
    public double calculate_bonus(){
        return salary * 0.2;
    }
    
}
