import java.util.Arrays;

/** Lab 8, Exercise 5 (Challenge): a generic bubbleSort tested on Integer[] and String[]. */
public class Ex5_BubbleSortGeneric {

    // EXPLAIN: bounded type: T must be Comparable<T> so compareTo is available
    static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        for (int pass = 0; pass < arr.length - 1; pass++) {
            for (int j = 0; j < arr.length - 1 - pass; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {      // out of order, so swap neighbours
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] numbers = { 5, 2, 9, 1, 7 };
        String[] words = { "pear", "apple", "fig", "banana" };

        bubbleSort(numbers);
        bubbleSort(words);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(words));

        // int[] plain = { 3, 1, 2 };
        // bubbleSort(plain);   // COMPILE ERROR
        /*
         * WHY int[] WILL NOT WORK: a type parameter T can only stand for a REFERENCE type, and int[] is
         * an array of primitives, not a T[]. Primitives also have no compareTo. Use Integer[] (wrapper
         * objects), as above, and autoboxing handles the conversion of the individual values.
         */
    }
}
