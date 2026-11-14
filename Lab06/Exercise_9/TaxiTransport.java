package Exercise_9;

public class TaxiTransport extends Transport {

    public TaxiTransport(double distance) {
        super(distance);
    }

    @Override
    public double calculate_fare() {
        return 20 + (distance * 5);
    }
}

