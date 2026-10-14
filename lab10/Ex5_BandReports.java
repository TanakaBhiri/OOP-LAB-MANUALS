import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

        if (!Files.exists(csv)) {
            Files.write(csv, List.of("Ada,1,3.9", "Kuda,2,3.2", "Rudo,3,3.9", "Farai,4,2.8", "Tariro,5,3.6", "Moyo,6,2.5"));
            System.out.println("Created sample learners.csv");
        }

        List<Learner> learners = new ArrayList<>();
        for (String line : Files.readAllLines(csv)) {
            if (!line.isBlank()) learners.add(Learner.fromCsv(line));
        }

        Map<String, List<Learner>> byBand = learners.stream()
                .collect(Collectors.groupingBy(l -> band(l.gpa())));

        for (Map.Entry<String, List<Learner>> entry : byBand.entrySet()) {
            Path report = Path.of("band-" + entry.getKey() + ".txt");
            Files.write(report, entry.getValue().stream().map(Learner::toCsv).toList());
            System.out.println("Band " + entry.getKey() + ": " + entry.getValue().size()
                               + " learner(s) written to " + report);
        }
    }
}
