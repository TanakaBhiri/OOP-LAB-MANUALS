import java.util.*;
public class Lab3Demo {
    public static void main(String[] args) {
        Student s=new Student("Rudo",84); System.out.println(s);
        try{s.setMarks(130);}catch(IllegalArgumentException e){System.out.println("Rejected: "+e.getMessage());}
        BankAccount a=new BankAccount("ACC-1",100); a.deposit(20); a.withdraw(15); System.out.println(a); System.out.println(a.getHistory());
        try{a.getHistory().clear();}catch(UnsupportedOperationException e){System.out.println("History cannot be modified by caller");}
        ImmutablePerson p=new ImmutablePerson("Tariro",20); System.out.println(p);
        Temperature t=new Temperature(300); System.out.printf("300 K = %.2f C = %.2f F%n",t.getCelsius(),t.getFahrenheit());
        // Callers use conversion methods, so the internal representation can be changed without changing caller code.
    }
}