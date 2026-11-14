package Exercise_1;

public class Main {
    public static void main(String[]args){
        Vehicle v1 = new Vehicle();
        v1.brand = "Mazdar";
        v1.year = 2026;

        Car c1 = new Car();
        c1.brand = "Honda";
        c1.year = 2025;
        c1.num_doors = 4;
        
        c1.start();
        c1.honk();

        System.out.println("Brand: " + c1.brand);
        System.out.println("Year: " + c1.year);
        System.out.println("Door: " + c1.num_doors);
    }
}
