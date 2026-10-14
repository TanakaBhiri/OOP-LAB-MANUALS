import java.util.*;

public class Student extends Person {
    private final String course;
    Student(String n,int a,String c){super(n,a);course=c;}
    @Override void display(){super.display();System.out.println("Course: "+course);}
}
