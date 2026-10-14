public class Circle {
    private final double radius;
    private static int count=0;
    Circle(double radius) { if(radius<0) throw new IllegalArgumentException("radius cannot be negative"); this.radius=radius; count++; }
    Circle() { this(1.0); }
    double area() { return Math.PI*radius*radius; }
    static int getCount() { return count; }
}
