record Student(String name, int age) { }

public class Ex2_StudentRecord {
    public static void main(String[] args) {
        Student a = new Student("Ada", 20);
        Student b = new Student("Ada", 20);

        System.out.println(a);
        System.out.println("a.equals(b)? " + a.equals(b));
        System.out.println("a == b?      " + (a == b));
        System.out.println("name component: " + a.name());
    }
}
