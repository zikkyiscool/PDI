package Practice_2;

    public class Temperature {

        private String name;
        private double tempC;

        // Constructor
        public Temperature(String name, double tempC) {
            this.name = name;
            this.tempC = tempC;
        }

        // Getters
        public String getName() {
            return name;
        }

        public double getTempc() {
            return tempC;
        }

        //Convert Celsius to Fahrenheit
        public double getTempF() {
            return (tempC * 9.0 / 5.0) + 32;
        }

        // Display one city information
        public void displayCities() {
            System.out.println("City's name: " + name);
            System.out.printf("Temperature: %.2f °C%n", tempC);
            System.out.printf("Fahrenheit: %.2f °F%n", getTempF());;
            System.out.println("-------------------");
        }
    }

