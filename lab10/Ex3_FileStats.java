import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

/**
 * Lab 10, Exercise 3 (Intermediate): read a text file and print the number of lines, words and characters.
 * Run with a file name (java Ex3_FileStats myfile.txt) or with none to use sample.txt.
 */
public class Ex3_FileStats {
    public static void main(String[] args) {
        Path file = Path.of(args.length > 0 ? args[0] : "sample.txt");

        try {
            List<String> lines = Files.readAllLines(file);

            // words: split each line on whitespace, ignore empty pieces, count them all
            long words = lines.stream()
                    .flatMap(line -> Arrays.stream(line.trim().split("\\s+")))
                    .filter(w -> !w.isEmpty())
                    .count();

            // characters: the length of every line added up (line breaks are not counted)
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
