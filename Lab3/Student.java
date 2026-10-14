import java.util.*;

public class Student {
    private String name; private int marks;
    Student(String name,int marks) { this.name=name; setMarks(marks); }
    void setMarks(int marks) { if(marks<0||marks>100) throw new IllegalArgumentException("Marks must be 0 to 100"); this.marks=marks; }
    int getMarks() { return marks; }
    String getGrade() { if(marks>=80)return "A"; if(marks>=70)return "B"; if(marks>=50)return "C"; return "F"; }
    public String toString() { return name+": "+marks+" ("+getGrade()+")"; }
}
