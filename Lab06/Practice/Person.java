package Practice;
public class Person{
    public String name;
    protected int age;
    protected String citizenID;

    Person(){
        this.name = "Unknown";
        this.age = 0;
        this.citizenID = "Unknown ID";
    }

    Person(String name, int age, String citizenID){
        this.name = name;
        this.age = age;
        this.citizenID = citizenID;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Citizen ID: " + citizenID);
        System.out.println("-----------------------");
    }
}