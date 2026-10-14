import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Lab 8, Exercise 1 (Basic): store 10 integers in an ArrayList; print sum, maximum and the list reversed. */
public class Ex1_IntegerList {
    public static void main(String[] args) {
        // EXPLAIN: generics need wrapper types, so List<Integer> not List<int>; autoboxing converts for us
        List<Integer> numbers = new ArrayList<>(List.of(4, 9, 2, 7, 1, 8, 3, 6, 5, 10));

        int sum = 0;
        for (int n : numbers) {            // auto-unboxing Integer -> int
            sum += n;
        }
        System.out.println("List:    " + numbers);
        System.out.println("Sum:     " + sum);
        System.out.println("Maximum: " + Collections.max(numbers));

        Collections.reverse(numbers);      // reverses IN PLACE (so the list must be mutable)
        System.out.println("Reversed:" + numbers);
    }
}
