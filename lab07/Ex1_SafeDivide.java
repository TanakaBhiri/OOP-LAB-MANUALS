import java.util.Scanner;

/** Lab 7, Exercise 1 (Basic): read two integers and divide them, handling bad input and division by zero. */
public class Ex1_SafeDivide {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Enter the first number: ");
            int a = Integer.parseInt(in.nextLine().trim());    // NumberFormatException on "abc"

            System.out.print("Enter the second number: ");
            int b = Integer.parseInt(in.nextLine().trim());

            System.out.println(a + " / " + b + " = " + (a / b));   // ArithmeticException if b == 0
        } catch (NumberFormatException e) {
            // EXPLAIN: specific catch blocks give a specific message for each problem
            System.out.println("That was not a whole number. Please enter digits only.");
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero.");
        } finally {
            System.out.println("Done."); // always runs
        }
    }
}
