
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Statistics {

    // Question 1: Total candidates and gender percentages
    public static void question1(ArrayList<Candidate> candidates) {

        int male = 0;
        int female = 0;

        for (Candidate c : candidates) {

            if (c.getGender().equalsIgnoreCase("male")) {
                male++;
            } else if (c.getGender().equalsIgnoreCase("female")) {
                female++;
            }
        }

        int total = candidates.size();

        System.out.println("\n===== QUESTION 1 =====");
        System.out.println("Total candidates: " + total);

        System.out.printf("Male percentage: %.2f%%\n",
                male * 100.0 / total);

        System.out.printf("Female percentage: %.2f%%\n",
                female * 100.0 / total);
    }

    // Question 2: Average score >= 90
    public static void question2(ArrayList<Candidate> candidates) {

        int total = 0;
        int male = 0;
        int female = 0;

        for (Candidate c : candidates) {

            if (c.getAverage() >= 90) {

                total++;

                if (c.getGender().equalsIgnoreCase("male")) {
                    male++;
                } else if (c.getGender().equalsIgnoreCase("female")) {
                    female++;
                }
            }
        }

        System.out.println("\n===== QUESTION 2 =====");
        System.out.println("Candidates with average >= 90: " + total);

        if (total > 0) {

            System.out.printf("Male percentage: %.2f%%\n",
                    male * 100.0 / total);

            System.out.printf("Female percentage: %.2f%%\n",
                    female * 100.0 / total);
        }
    }

    // Question 3: Subject scores >= 85
    public static void question3(ArrayList<Candidate> candidates) {

        int math = 0;
        int english = 0;
        int computer = 0;

        for (Candidate c : candidates) {

            if (c.getMath() >= 85) {
                math++;
            }

            if (c.getEnglish() >= 85) {
                english++;
            }

            if (c.getComputer() >= 85) {
                computer++;
            }
        }

        System.out.println("\n===== QUESTION 3 =====");

        System.out.println("Math: " + math);
        System.out.println("English: " + english);
        System.out.println("Computer: " + computer);
    }

    // Question 4: Candidates in each group
    public static void question4(ArrayList<Candidate> candidates) {

        TreeMap<String, int[]> groups = new TreeMap<>();

        for (Candidate c : candidates) {

            String group = c.getGroup();

            if (!groups.containsKey(group)) {
                groups.put(group, new int[3]);
            }

            int[] count = groups.get(group);

            count[0]++;

            if (c.getGender().equalsIgnoreCase("male")) {
                count[1]++;
            } else if (c.getGender().equalsIgnoreCase("female")) {
                count[2]++;
            }
        }

        System.out.println("\n===== QUESTION 4 =====");

        for (Map.Entry<String, int[]> entry : groups.entrySet()) {

            String group = entry.getKey();
            int[] count = entry.getValue();

            int total = count[0];
            int male = count[1];
            int female = count[2];

            System.out.println("\nGroup: " + group);
            System.out.println("Total candidates: " + total);

            System.out.printf("Male percentage: %.2f%%\n",
                    male * 100.0 / total);

            System.out.printf("Female percentage: %.2f%%\n",
                    female * 100.0 / total);
        }
    }
}
