/** Lab 3, Exercise 1 (Basic): reject invalid marks in the setter. */
public class Ex1_StudentValidation {
    public static void main(String[] args) {
        Student s = new Student("Tariro", 82);
        System.out.println(s.getName() + " has " + s.getMarks() + " marks");

        try {
            s.setMarks(150);                      // invalid: above 100
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected: " + e.getMessage());
        }

        try {
            s.setMarks(-5);                       // invalid: below 0
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected: " + e.getMessage());
        }

        System.out.println("Marks are still " + s.getMarks());   // unchanged: the object stayed valid
    }
}
