import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/** Lab 10, Exercise 1 (Basic): save five lines typed by the user to a file, then read them back. */
public class Ex1_SaveLines {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> lines = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Line " + i + ": ");
            lines.add(in.nextLine());
        }

        Path file = Path.of("my-lines.txt");      // relative path: resolves against the working directory
        try {
            Files.write(file, lines);             // creates or overwrites the file
            System.out.println("\nSaved to " + file.toAbsolutePath());

            System.out.println("Reading it back:");
            for (String line : Files.readAllLines(file)) {
                System.out.println("  " + line);
            }
        } catch (IOException e) {
            // IOException is checked: files can fail for reasons outside the program's control
            System.out.println("File problem: " + e.getMessage());
        }
    }
}
