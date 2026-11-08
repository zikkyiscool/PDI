package Exercise_3;
public class Main {
    public static void main(String[]args){
        Book book1 = new Book();
        Book book2 = new Book("King's game", "J.Art", 27);
        
        //Display books
        System.out.println("=======Book Information=======");
        book1.display();
        System.out.println("-------------------------------");
        book2.display();
        System.out.println("-------------------------------");
    } 
}


