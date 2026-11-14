package Exercise_9;

public abstract class Transport {

    protected double distance;

    public Transport(double distance) {
        this.distance = distance;
    }

    public abstract double calculate_fare();

    public void display_fare() {
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: $" + calculate_fare());
    }
}

