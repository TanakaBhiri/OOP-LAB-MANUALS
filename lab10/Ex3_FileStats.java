import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class Ex3_FileStats {
    public static void main(String[] args) {
        Path file = Path.of(args.length > 0 ? args[0] : "sample.txt");

        try {
            List<String> lines = Files.readAllLines(file);

            long words = lines.stream()
                    .flatMap(line -> Arrays.stream(line.trim().split("\\s+")))
                    .filter(w -> !w.isEmpty())
                    .count();

            long chars = lines.stream().mapToLong(String::length).sum();

            System.out.println("File: " + file);
            System.out.println("Lines:      " + lines.size());
            System.out.println("Words:      " + words);
            System.out.println("Characters: " + chars);
        } catch (IOException e) {
            System.out.println("Could not read " + file + ": " + e.getMessage());
        }
    }
}
