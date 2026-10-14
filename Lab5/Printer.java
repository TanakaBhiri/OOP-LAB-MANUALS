public class Printer {
    void print(int x){System.out.println("int: "+x);}
    void print(double x){System.out.println("double: "+x);}
    void print(String x){System.out.println("String: "+x);}
    void print(int[] x){System.out.print("array: ");for(int n:x)System.out.print(n+" ");System.out.println();}
}
