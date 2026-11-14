package Practice;
public class Student extends Person {
    String studentID;
    String major;

    Student(String studentID, String major){
        this.studentID = studentID;
        this.major = major;
    }

    Student(String name, int age, 
        String citizenID, String studentID, String major){
        super(name, age, citizenID);
        this.studentID = studentID;
        this.major = major;
    }
    void display(){
        super.display();

        System.out.println("Student ID: " + studentID);
        System.out.println("Major: " + major);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + "Citizen ID: " + citizenID);
    }   
}
