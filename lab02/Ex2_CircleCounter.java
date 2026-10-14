public class Ex2_CircleCounter {
    public static void main(String[] args) {
        System.out.println("Circles before: " + Circle.getCount());

        new Circle(2);
        new Circle();
        new Circle(7.5);

        System.out.println("Circles after:  " + Circle.getCount());
    }
}
