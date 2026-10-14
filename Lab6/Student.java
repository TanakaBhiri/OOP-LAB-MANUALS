import java.util.*;

public class Student implements Comparable<Student> {
    final String name;final int marks;Student(String n,int m){name=n;marks=m;}
    public int compareTo(Student s){return name.compareToIgnoreCase(s.name);}
    public String toString(){return name+"("+marks+")";}
}
