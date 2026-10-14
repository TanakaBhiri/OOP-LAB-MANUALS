/** Lab 2, Exercise 2 (Basic): a static counter tracks how many circles exist. */
public class Ex2_CircleCounter {
    public static void main(String[] args) {
        System.out.println("Circles before: " + Circle.getCount());   // 0, no object needed to ask

        new Circle(2);
        new Circle();
        new Circle(7.5);

        System.out.println("Circles after:  " + Circle.getCount());   // 3
    }
}
