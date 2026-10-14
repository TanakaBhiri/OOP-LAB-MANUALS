import java.util.*;
public class Lab6Demo {
    public static void main(String[] args) {
        Shape[] shapes={new Circle(2),new Rectangle(3,4),new Square(3)};
        for(Shape s:shapes)System.out.printf("%s area=%.2f perimeter=%.2f%n",s.getClass().getSimpleName(),s.area(),s.perimeter());
        Flyable[] flyers={new Bird(),new Aeroplane()};for(Flyable f:flyers)f.fly();
        Account savings=new SavingsAccount(),current=new CurrentAccount();savings.deposit(100);current.deposit(100);
        System.out.println("Fees: "+savings.monthlyFee()+", "+current.monthlyFee());
        List<Student> students=new ArrayList<>(List.of(new Student("Tariro",80),new Student("Amai",95),new Student("Kuda",70)));
        Collections.sort(students);System.out.println("By name: "+students);
        students.sort(Comparator.comparingInt((Student s)->s.marks).reversed());System.out.println("By marks: "+students);
        new Both().hello();
    }
}