package Exercise_6;
public class Circle {

    //Attribute
    private double radius;

    //Constructor
    public Circle(double radius){
        this.radius = radius;
    }

    // Getter method
    public double getRadius(){
        return radius;
    }

    // Setter method
    public void setRadius(double radius){
        this.radius = radius;
    }

    // Method to calculate parimeter
    public double circleParimeter(){
        return (2 * 3.14 * radius);
    }

    // Method to calculate parimeter
    public double circleArea(){
        return (2 * 3.14 * radius);
    }
    
}
