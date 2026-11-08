package Exercise_7;
public class Student {
    private String name;
    private int id;
    private int age;
    private String gender;

    public Student(String name, int id, int age, String gender) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("--------------------");
    }
}

