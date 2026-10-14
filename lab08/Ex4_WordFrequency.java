import java.util.HashMap;
import java.util.Map;

/** Lab 8, Exercise 4 (Intermediate): word frequency of a paragraph, sorted by frequency (descending). */
public class Ex4_WordFrequency {
    public static void main(String[] args) {
        // A fixed paragraph so the program is repeatable (a Scanner could read one instead)
        String paragraph = "To be or not to be that is the question. "
                         + "Whether it is nobler to suffer or to take arms, to be brave.";

        Map<String, Integer> freq = new HashMap<>();
        // Remove punctuation, lower-case, then split into words on whitespace
        for (String word : paragraph.toLowerCase().replaceAll("[^a-z ]", "").split("\\s+")) {
            freq.merge(word, 1, Integer::sum);       // add 1, or start at 1 if the word is new
        }

        // A HashMap has no order, so sort the entries: highest count first, then alphabetically
        freq.entrySet().stream()
            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                    .thenComparing(Map.Entry.comparingByKey()))
            .forEach(e -> System.out.println(e.getKey() + " = " + e.getValue()));
    }
}
