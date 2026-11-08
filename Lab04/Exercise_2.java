import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.io.*;

public class Exercise_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter the number of files: ");
        int n = sc.nextInt();

        // Step 2: Create folder
        File folder = new File("Ex2LuckyNumber");

        if (!folder.exists()) {
            folder.mkdir();
        }
         try {
            for (int i = 1; i <= n; i++) {

                int randomNumber = random.nextInt(100) + 1;

                File file = new File(folder, "file" + i + ".csv");

                FileWriter writer = new FileWriter(file);

                writer.write(randomNumber + "");

                writer.close();

                System.out.println("Created: " + file.getName());
            }
            for (int i = 1; i <= n; i++) {

                File file = new File(folder, "file" + i + ".csv");

                BufferedReader reader =
                    new BufferedReader(new FileReader(file));

                String line;
                while ((line = reader.readLine()) != null) {
                    numbers.add(Integer.parseInt(line));
                }
                reader.close();
            }
            int max = numbers.get(0);
            int min = numbers.get(0);

            for (int num : numbers) {

                if (num > max) {
                    max = num;
                }

                if (num < min) {
                    min = num;
                }
            }
            System.out.println("\nAll numbers: " + numbers);
            System.out.println("Maximum number: " + max);
            System.out.println("Minimum number: " + min);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        sc.close();
    }
}





