import java.util.Scanner;

public class Ex1_SafeDivide {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Enter the first number: ");
            int a = Integer.parseInt(in.nextLine().trim());

            System.out.print("Enter the second number: ");
            int b = Integer.parseInt(in.nextLine().trim());

            System.out.println(a + " / " + b + " = " + (a / b));
        } catch (NumberFormatException e) {

            System.out.println("That was not a whole number. Please enter digits only.");
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero.");
        } finally {
            System.out.println("Done.");
        }
    }
}
