import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex1_IntegerList {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(4, 9, 2, 7, 1, 8, 3, 6, 5, 10));

        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        System.out.println("List:    " + numbers);
        System.out.println("Sum:     " + sum);
        System.out.println("Maximum: " + Collections.max(numbers));

        Collections.reverse(numbers);
        System.out.println("Reversed:" + numbers);
    }
}
