package Practice;
public class MainProgress {
    public static void main(String[]args){
        Student s1 = new Student("Kimleng", 20, "20250056", "1064","AIECS");
        Person p1 = new Person();

        System.out.println("---------------");
        p1.display();
        s1.display();

        System.out.println(s1.name);
        System.out.println(s1.studentID);
        System.out.println(p1.citizenID);
        System.out.println("---------------");
    }
}
