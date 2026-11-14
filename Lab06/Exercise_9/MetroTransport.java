package Exercise_9;

public class MetroTransport extends Transport {

    public MetroTransport(double distance) {
        super(distance);
    }

    @Override
    public double calculate_fare() {
        return 10 + (distance * 2);
    }
}
