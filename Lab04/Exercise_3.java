import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercise_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
                PrintWriter writer = new PrintWriter(
                new FileWriter("Ex3StudentData.csv")
            );
            writer.println("Name,ID,Gender");

            for (int i = 1; i <= 3; i++) {

                System.out.println("\nStudent " + i);

                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter ID: ");
                String id = sc.nextLine();

                System.out.print("Enter gender: ");
                String gender = sc.nextLine();

                writer.println(name + "," + id + "," + gender);
            }
            writer.close();
            System.out.println("\nData saved successfully!");
            System.out.println("File: Ex3StudentData.csv");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        sc.close();
    }
}
