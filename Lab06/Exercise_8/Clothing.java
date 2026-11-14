package Exercise_8;

class Clothing extends Product {
    private String size;

    public Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public void get_info() {
        System.out.println("Clothing: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Size: " + size);
    }
}
