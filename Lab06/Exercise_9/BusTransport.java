package Exercise_9;

public class BusTransport extends Transport {

    public BusTransport(double distance) {
        super(distance);
    }

    @Override
    public double calculate_fare() {
        return distance * 1.5;
    }
}

