package Practice_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of cities: ");
        int n = sc.nextInt();
        sc.nextLine();

        if (n <= 0) {
            System.out.println("Number must be positive!");
            sc.close();
            return;
        }

        City City = new City(n);

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for city " + (i + 1));

            System.out.print("City name: ");
            String name = sc.nextLine();

            System.out.print("Temperature in Celsius: ");
            double tempC = sc.nextDouble();
            sc.nextLine();

            Temperature city = new Temperature(name, tempC);
            City.addCity(city);
        }

        System.out.println("\n===== RESULTS =====");
        City.displayAllCities();

        sc.close();
    }
}