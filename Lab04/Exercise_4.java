import java.io.*;
import java.util.ArrayList;

public class Exercise_4 {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        try {
            BufferedReader reader =
                new BufferedReader(new FileReader("Ex3StudentData.csv"));

            String line;

            reader.readLine();

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                String name = data[0];
                String id = data[1];
                String gender = data[2];

                Student student = new Student(name, id, gender);

                students.add(student);
            }

            reader.close();

            System.out.println("Student Information");
            System.out.println("-----------------------------");

            for (Student s : students) {
                System.out.println("Name: " + s.name);
                System.out.println("ID: " + s.id);
                System.out.println("Gender: " + s.gender);
                System.out.println("-----------------------------");
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    static class Student {

        String name;
        String id;
        String gender;

        public Student(String name, String id, String gender) {
            this.name = name;
            this.id = id;
            this.gender = gender;
        }
    }
}

