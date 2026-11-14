package Exercise_6;

public class Triangle extends Shape {
    double height;
    double base;
    public Triangle(double height, double base){
        this.height = height;
        this.base = base;
    }

    @Override 
    public double area(){
        return (height * base)/2 ;
    }
}
