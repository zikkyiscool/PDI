package Practice_1;

public class Library {
    private Book[] books;
    private int count;

    // Constructor
    public Library(int size) {
        books = new Book[size];
        count = 0;
    }

    // Add a book
    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
        }else {
            System.out.println("Book list is full!");
        }
    }

    // Display all books
    public void displayAllBooks() {
        for (int i = 0; i < count; i++) {
            System.out.println("\nBook " + (i + 1));
            books[i].displayBook();
        }
    }

    // Calculate average price
    public double calculateAveragePrice() {
        if (count == 0) {
            return 0;
        }
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += books[i].getPrice();
        }
        return total / count;
    }
}
