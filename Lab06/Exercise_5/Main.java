package Exercise_5;

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("Java Programming", 101);
        
        b1.display_info();

        // Cannot directly access protected members
        // from an unrelated class outside the package.
        // System.out.println(b1._title); // Error
    }
}
