package Practice_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        if (n <= 0) {
            System.out.println("Number of books must be positive.");
            sc.close();
            return;
        }

        Library library = new Library(n);

        // Input book information
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for book " + (i + 1));

            System.out.print("Book ID: ");
            String id = sc.nextLine();

            System.out.print("Title: ");
            String title = sc.nextLine();

            System.out.print("Author: ");
            String author = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            Book book = new Book(id, title, author, price);
            library.addBook(book);
        }

        // Display results
        System.out.println("\n===== LIBRARY BOOKS =====");
        library.displayAllBooks();

        System.out.printf(
                "%nAverage price: $%.2f%n",
                library.calculateAveragePrice()
        );
        sc.close();
    }
}
