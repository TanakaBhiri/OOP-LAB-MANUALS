import java.util.Arrays;

public class Ex5_BubbleSortGeneric {

    static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        for (int pass = 0; pass < arr.length - 1; pass++) {
            for (int j = 0; j < arr.length - 1 - pass; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
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

    }
}
