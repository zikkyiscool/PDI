package Practice_4;

public class Student {

    private String studentId;
    private String name;
    private double math;
    private double physic;
    private double chemistry;
    private double it;
    private double pe;

    private static Student[] students;
    private static int count = 0;

        // Constructor for each student;
        public Student(String studentId,String name, double math,
                       double physic,double chemistry, double it, double pe) {
            this.studentId = studentId;
            this.name = name;
            this.math = math;
            this.physic = physic;
            this.chemistry = chemistry;
            this.it = it;
            this.pe = pe;
        }

        // Initialize the array
        public static void initialize(int size) {
            students = new Student[size];
            count = 0;
        }

        // Add a student
        public static void addStudent(Student student) {
            if (count < students.length) {
                students[count] = student;
                count++;
            } else {
                System.out.println("The number of student is full!");
            }
        }
        // Calculate for total score
        public double getTotal() {
            return (math + physic + chemistry + it + pe);
        }
        //Deciding grade
        public String getGrade() {
            double average = getTotal() / 5;

            if (average >= 90) {
                return "A";
            } else if (average >= 75) {
                return "B";
            } else if (average >= 50) {
                return "C";
            }else {
                return "F";
            }
        }
        // Display one student
        public void displayStudent() {
            System.out.println("Student ID: " + studentId);
            System.out.println("Student's name: " + name);
            System.out.printf("Total: %.2f %n", getTotal());
            System.out.printf("Average: %.2f %n",getTotal()/5);
            System.out.printf("Grade: %s %n",getGrade());
        }

        // Display all students
        public static void displayAllStudents() {
            for (int i = 0; i < count; i++) {
                System.out.println("\nStudent " + (i + 1));
                students[i].displayStudent();
            }
        }

}
