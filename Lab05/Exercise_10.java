import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Exercise_10 {
    public static void main(String[]args){

        ArrayList<String> students = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("students.csv"))){
            String line;
            br.readLine();
        while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                students.add(data[0]);    
            }
        System.out.print("Student sorted in order");
        students.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .forEach(name -> System.out.println(name));
       } catch (IOException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
    }
}

