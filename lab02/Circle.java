public class Circle {

    private static int count = 0;

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        count++;
    }

    public Circle() {
        this(1.0);
    }

    public double getRadius() { return radius; }

    public double area() { return Math.PI * radius * radius; }

    public static int getCount() { return count; }
}
