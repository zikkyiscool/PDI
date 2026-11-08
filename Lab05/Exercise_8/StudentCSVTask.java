package Exercise_8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StudentCSVTask extends Thread {

    @Override
    public void run() {

        ArrayList<Student> students = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(
                new FileReader("students.csv")
            );
            String line;

            // Skip header
            br.readLine();
            while ((line = br.readLine()) != null) {

            // Skip empty lines
            if (line.trim().isEmpty()) {
                continue;
            }

            String[] data = line.split(",");

            if (data.length != 4) {
                System.out.println("Invalid CSV row: " + line);
                continue;
            }

            String name = data[0];
            int id = Integer.parseInt(data[1]);
            int age = Integer.parseInt(data[2]);
            String gender = data[3];

            Student student = new Student(name, id, age, gender);

            students.add(student);
            }
            br.close();

            System.out.println("\nStudent Information:");

            for (Student s : students) {
                s.display();
            }
            System.out.println("Total students: " + students.size());

        } catch (IOException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
    }
}
