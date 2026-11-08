package Practice_2;

public class City {
    private Temperature[] cities;
    private int count;

    // Constructor
    public City(int size) {
        cities = new Temperature[size];
        count = 0;
    }

    // Add a city
    public void addCity(Temperature city) {
        if (count < cities.length) {
            cities[count] = city;
            count++;
        } else {
            System.out.println("City list is full!");
        }
    }

    // Display all cities
    public void displayAllCities() {
        for (int i = 0; i < count; i++) {
            System.out.println("\nCity " + (i + 1));
            cities[i].displayCities();
        }
    }
}
