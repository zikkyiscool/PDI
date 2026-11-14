package Exercise_8;

class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void get_info() {
            System.out.println("Product: " + name);
            System.out.println("Price: $" + price);
    }
}
