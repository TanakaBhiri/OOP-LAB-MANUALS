import java.util.*;
public class Lab7Demo {
    static int safeDivide(int a,int b){return a/b;}
    static int arrayAt(int[] values,int index){return values[index];}
    static void validateAge(int age) throws InvalidAgeException { if(age<0||age>120)throw new InvalidAgeException("Age must be from 0 to 120"); }
    static int finallyDemo(){try{System.out.println("try runs");return 1;}finally{System.out.println("finally runs before return completes");}}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Exercise 1: enter two integers (or use default 12 and 3 if input is absent):");
        try {
            int a,b;
            if(sc.hasNextInt()){a=sc.nextInt();if(!sc.hasNextInt())throw new InputMismatchException();b=sc.nextInt();}
            else {a=12;b=3;}
            System.out.println("Result: "+safeDivide(a,b));
        } catch(InputMismatchException e){System.out.println("Please enter integers only.");}
          catch(ArithmeticException e){System.out.println("Cannot divide by zero.");}
        int[] nums={10,20,30};try{System.out.println(arrayAt(nums,9));}catch(ArrayIndexOutOfBoundsException e){System.out.println("Invalid array index handled.");}
        try{validateAge(150);}catch(InvalidAgeException e){System.out.println(e.getMessage());}
        BankAccount account=new BankAccount(50);try{account.withdraw(70);}catch(InsufficientFundsException e){System.out.println(e.getMessage());}
        System.out.println("return value="+finallyDemo());
    }
}