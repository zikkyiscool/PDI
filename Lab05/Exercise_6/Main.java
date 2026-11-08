package Exercise_6;
public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("===== Rectangle =====");
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.rectangleArea());
        System.out.println("Perimeter: " + rectangle.rectangleParimeter());
        Circle circle = new Circle(7);

        System.out.println("\n===== Circle =====");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.circleArea());
        System.out.println("Perimeter: " + circle.circleParimeter());

        rectangle.setWidth(8);
        circle.setRadius(10);

        System.out.println("\n===== Updated Values =====");
        System.out.println("Rectangle Area: " + rectangle.rectangleArea());
        System.out.println("Circle Area: " + circle.circleArea());
    }
}

