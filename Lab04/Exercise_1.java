import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Exercise_1 {
    public static void main(String[] args) {
        Random ra = new Random();
        try {
                PrintWriter writer = new PrintWriter(
                new FileWriter("LuckyNumber.csv")
            );
            
            for (int i = 1; i <= 500; i++) {
                int number = ra.nextInt(100, 1000);
                writer.println("Lucky number: " + number);
            }
            writer.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}




