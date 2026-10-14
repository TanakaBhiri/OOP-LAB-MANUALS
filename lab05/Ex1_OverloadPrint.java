import java.util.Arrays;

/** Lab 5, Exercise 1 (Basic): overload print() for int, double, String and int[]. */
public class Ex1_OverloadPrint {

    // EXPLAIN: same name, different parameter lists. The COMPILER picks one from the argument types.
    static void print(int x)      { System.out.println("int:      " + x); }
    static void print(double x)   { System.out.println("double:   " + x); }
    static void print(String x)   { System.out.println("String:   " + x); }
    static void print(int[] x)    { System.out.println("int[]:    " + Arrays.toString(x)); }

    public static void main(String[] args) {
        print(42);                      // print(int)
        print(3.14);                    // print(double)
        print("Hello");                 // print(String)
        print(new int[] {1, 2, 3});     // print(int[])
        print('A');                     // a char widens to int, so print(int) runs and shows 65
    }
}
