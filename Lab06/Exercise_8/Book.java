package Exercise_8;

class Book extends Product {
    private String author;

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    @Override
    public void get_info() {
        System.out.println("Book: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Author: " + author);
    }
}