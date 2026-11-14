package Exercise_9;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Transport> transports = new ArrayList<>();

        transports.add(new BusTransport(10));
        transports.add(new MetroTransport(8));
        transports.add(new TaxiTransport(5));

        transports.add(new BusTransport(20));
        transports.add(new MetroTransport(12));
        transports.add(new TaxiTransport(10));

        for (Transport t : transports) {

            System.out.println("Transport Type: "
                    + t.getClass().getSimpleName());

            t.display_fare();

            System.out.println("----------------------");
        }
    }
}
