package Exercise_3;
public class Book {
    //Attribute
    String title;
    String author;
    double price;

    //Constructor for default
    public Book(){
        title = "Unknown";
        author = "Unknown";
        price = 0;
    }
    
    //Parameter connstructor
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //Method to display detail of book
    public void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}


