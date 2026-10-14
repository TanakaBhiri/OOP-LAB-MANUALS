import java.util.HashMap;
import java.util.Map;

public class Ex4_WordFrequency {
    public static void main(String[] args) {

        String paragraph = "To be or not to be that is the question. "
                         + "Whether it is nobler to suffer or to take arms, to be brave.";

        Map<String, Integer> freq = new HashMap<>();

        for (String word : paragraph.toLowerCase().replaceAll("[^a-z ]", "").split("\\s+")) {
            freq.merge(word, 1, Integer::sum);
        }

        freq.entrySet().stream()
            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                    .thenComparing(Map.Entry.comparingByKey()))
            .forEach(e -> System.out.println(e.getKey() + " = " + e.getValue()));
    }
}
