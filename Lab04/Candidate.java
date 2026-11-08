
public class Candidate {

    private int id;
    private String gender;
    private String group;
    private int math;
    private int english;
    private int computer;
    private double average;

    // Constructor
    public Candidate(int id, String gender, String group,
                     int math, int english, int computer,
                     double average) {

        this.id = id;
        this.gender = gender;
        this.group = group;
        this.math = math;
        this.english = english;
        this.computer = computer;
        this.average = average;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public String getGroup() {
        return group;
    }

    public int getMath() {
        return math;
    }

    public int getEnglish() {
        return english;
    }

    public int getComputer() {
        return computer;
    }

    public double getAverage() {
        return average;
    }
}