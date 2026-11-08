package Exercise_6;
public class Rectangle {

    // Attribute
        private double width;
        private double height;

    // Constructor
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    } 

    // Getter methods
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }

    // Setter methods
    public void setWidth(double width){
        this.width = width;
    }
    public void setLength(double height){
        this.height = height;
    }

    // Method to calculate area of rectangle
    public double rectangleArea(){
        return (width * height);
    }

    // Method to calculate parimeter of rectangle
    public double rectangleParimeter(){
        return (2*(width + height));
    }
}




