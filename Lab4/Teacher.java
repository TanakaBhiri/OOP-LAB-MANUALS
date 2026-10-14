import java.util.*;

public class Teacher extends Person {
    private final String subject;
    Teacher(String n,int a,String s){super(n,a);subject=s;}
    @Override void display(){super.display();System.out.println("Subject: "+subject);}
}
