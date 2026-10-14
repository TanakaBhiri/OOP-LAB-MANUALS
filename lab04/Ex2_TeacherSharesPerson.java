public class Ex2_TeacherSharesPerson {
    public static void main(String[] args) {
        Student s = new Student("Ada", 20, "Computer Science");
        Teacher t = new Teacher("Mrs Dube", 38, "Mathematics");

        s.display();
        t.display();
        System.out.println("Student course: " + s.getCourse() + ", Teacher subject: " + t.getSubject());
    }
}
