import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Lab 10, Exercise 5 (Challenge): load learners from learners.csv, group them by grade band (A, B, C)
 * with Collectors.groupingBy, and write one report file per band.
 * Band thresholds are an assumption: A = GPA 3.5 or more, B = 3.0 or more, otherwise C.
 */
record Learner(String name, int roll, double gpa) {
    static Learner fromCsv(String line) {
        String[] p = line.split(",");
        return new Learner(p[0], Integer.parseInt(p[1]), Double.parseDouble(p[2]));
    }
    String toCsv() { return name + "," + roll + "," + gpa; }
}

public class Ex5_BandReports {

    static String band(double gpa) {
        if (gpa >= 3.5) return "A";
        if (gpa >= 3.0) return "B";
        return "C";
    }

    public static void main(String[] args) throws IOException {
        Path csv = Path.of("learners.csv");

        // First run: create sample data so the program works out of the box
        if (!Files.exists(csv)) {
            Files.write(csv, List.of("Ada,1,3.9", "Kuda,2,3.2", "Rudo,3,3.9", "Farai,4,2.8", "Tariro,5,3.6", "Moyo,6,2.5"));
            System.out.println("Created sample learners.csv");
        }

        // Load every line into a Learner
        List<Learner> learners = new ArrayList<>();
        for (String line : Files.readAllLines(csv)) {
            if (!line.isBlank()) learners.add(Learner.fromCsv(line));
        }

        // EXPLAIN: groupingBy builds a Map from band letter -> list of learners in that band
        Map<String, List<Learner>> byBand = learners.stream()
                .collect(Collectors.groupingBy(l -> band(l.gpa())));

        // One report file per band
        for (Map.Entry<String, List<Learner>> entry : byBand.entrySet()) {
            Path report = Path.of("band-" + entry.getKey() + ".txt");
            Files.write(report, entry.getValue().stream().map(Learner::toCsv).toList());
            System.out.println("Band " + entry.getKey() + ": " + entry.getValue().size()
                               + " learner(s) written to " + report);
        }
    }
}
