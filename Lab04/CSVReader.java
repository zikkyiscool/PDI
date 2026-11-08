
import java.io.*;
import java.util.ArrayList;

public class CSVReader {

    public static ArrayList<Candidate> readCSV(String filename) {

        ArrayList<Candidate> candidates = new ArrayList<>();

        try {
            BufferedReader reader =
                new BufferedReader(new FileReader(filename));

            // Skip the three physical header lines
            reader.readLine();
            reader.readLine();
            reader.readLine();

            String line;

            while ((line = reader.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0].trim());
                String gender = data[1].trim();
                String group = data[2].trim();

                int math = Integer.parseInt(data[5].trim());
                int english = Integer.parseInt(data[6].trim());
                int computer = Integer.parseInt(data[7].trim());

                double average =
                    Double.parseDouble(data[9].trim());

                Candidate c = new Candidate(
                    id, gender, group,
                    math, english, computer, average
                );

                candidates.add(c);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return candidates;
    }
}
