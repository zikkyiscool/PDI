package Exercise_8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Electronics("Laptop", 850, 2));
        products.add(new Clothing("T-Shirt", 15, "L"));
        products.add(new Book("Java Programming", 30, "James Gosling"));

        for (Product p : products) {
            p.get_info();
            System.out.println("----------------------");
        }
    }
}

