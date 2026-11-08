package Practice_4;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number of Student: ");
            int n = sc.nextInt();
            sc.nextLine();

            if (n <= 0) {
                System.out.println("Number must be positive!");
                sc.close();
                return;
            }

            // Initialize the student array
            Student.initialize(n);

            // Input Student marks of each subject
            for (int i = 0; i < n; i++) {
                System.out.println("\nEnter mark for each student " + (i + 1));

                System.out.print("Student ID: ");
                String studentId = sc.nextLine();

                System.out.print("Student's name: ");
                String name = sc.nextLine();

                System.out.println("Input student's score");

                System.out.print("Math: ");
                double math = sc.nextDouble();
                sc.nextLine();

                System.out.print("Physic: ");
                double physic = sc.nextDouble();

                System.out.print("Chemistry: ");
                double chemistry = sc.nextDouble();

                System.out.print("IT: ");
                double it = sc.nextDouble();

                System.out.print("PE: ");
                double pe = sc.nextDouble();
                sc.nextLine();
                // Create and add a student
                Student student = new Student(studentId, name, math, physic, chemistry, it, pe);
                Student.addStudent(student);
            }

            // Display results
            System.out.println("\n===== RESULTS =====");
            Student.displayAllStudents();
            sc.close();
        }
    }
