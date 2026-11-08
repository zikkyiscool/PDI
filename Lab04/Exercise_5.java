import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Exercise_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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

                Student s = new Student(name, id, gender);

                students.add(s);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        for (int i = 1; i <= 3; i++) {

            System.out.println("\nEnter student " + i);

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter ID: ");
            String id = sc.nextLine();

            System.out.print("Enter gender: ");
            String gender = sc.nextLine();

            Student s = new Student(name, id, gender);

            students.add(s);
        }

        students.sort((s1, s2) ->
            s1.name.compareToIgnoreCase(s2.name));

        try {
            BufferedWriter writer =
                new BufferedWriter(new FileWriter("Ex3StudentData.csv"));

            writer.write("Name,ID,Gender");
            writer.newLine();

            for (Student s : students) {

                writer.write(s.name + "," + s.id + "," + s.gender);
                writer.newLine();
            }

            writer.close();

            System.out.println("\nStudent data saved successfully!");

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
        System.out.println("\nStudents sorted alphabetically:");
        System.out.println("--------------------------------");

        for (Student s : students) {

            System.out.println("Name: " + s.name);
            System.out.println("ID: " + s.id);
            System.out.println("Gender: " + s.gender);

            System.out.println("--------------------------------");
        }
        sc.close();
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
