/** Lab 7, Exercise 3 (Intermediate): a CHECKED InvalidAgeException thrown by validateAge(int) outside 0..120. */

// EXPLAIN: extending Exception (not RuntimeException) makes this a CHECKED exception
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) { super(message); }
}

public class Ex3_InvalidAge {

    // 'throws' warns callers that they must handle this checked exception
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Age must be between 0 and 120, but got " + age);
        }
        System.out.println(age + " is a valid age");
    }

    public static void main(String[] args) {
        int[] ages = { 25, -3, 150, 120 };
        for (int age : ages) {
            try {
                validateAge(age);
            } catch (InvalidAgeException e) {
                System.out.println("Rejected: " + e.getMessage());
            }
        }
    }
}
