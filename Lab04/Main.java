
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Step 1: Read CSV file
        ArrayList<Candidate> candidates =
            CSVReader.readCSV("CandidatePerformanceTest.csv");

        // Step 2: Check candidate data
        if (candidates.isEmpty()) {
            System.out.println("No candidate data found!");
            return;
        }

        // Step 3: Display total candidates
        System.out.println("Total records loaded: " +
                candidates.size());

        // Step 4: Run all statistics
        Statistics.question1(candidates);

        Statistics.question2(candidates);

        Statistics.question3(candidates);

        Statistics.question4(candidates);
    }
}
