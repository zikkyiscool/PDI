package Exercise_8;

class Electronics extends Product {
    private int warranty;

    public Electronics(String name, double price, int warranty) {
        super(name, price);
        this.warranty = warranty;
    }

    @Override
    public void get_info() {
        System.out.println("Electronics: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Warranty: " + warranty + " years");
    }
}
