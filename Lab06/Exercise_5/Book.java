package Exercise_5;

public class Book extends LibraryItem {

    public Book(String title, int id) {
        super(title, id);
    }

    @Override
    public void display_info() {
        System.out.println("=== Book Information ===");
        System.out.println("Book Title: " + _title);
        System.out.println("Book ID: " + _id);
    }
}

