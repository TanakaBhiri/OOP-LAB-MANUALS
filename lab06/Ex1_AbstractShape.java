/** Lab 6, Exercise 1 (Basic): abstract Shape with area() and perimeter(); Circle, Rectangle, Square. */
abstract class Shape {
    // EXPLAIN: abstract methods have NO body; every concrete subclass MUST supply one
    abstract double area();
    abstract double perimeter();
}

class Circle extends Shape {
    private final double r;
    Circle(double r) { this.r = r; }
    @Override double area()      { return Math.PI * r * r; }
    @Override double perimeter() { return 2 * Math.PI * r; }
}

class Rectangle extends Shape {
    protected final double w, h;
    Rectangle(double w, double h) { this.w = w; this.h = h; }
    @Override double area()      { return w * h; }
    @Override double perimeter() { return 2 * (w + h); }
}

// A square IS-A rectangle whose sides are equal, so it reuses Rectangle's formulas
class Square extends Rectangle {
    Square(double side) { super(side, side); }
}

public class Ex1_AbstractShape {
    public static void main(String[] args) {
        // Shape s = new Shape();   // COMPILE ERROR: Shape is abstract and cannot be instantiated
        Shape[] shapes = { new Circle(5), new Rectangle(4, 6), new Square(3) };

        for (Shape s : shapes) {
            System.out.printf("%-10s area = %7.2f  perimeter = %6.2f%n",
                    s.getClass().getSimpleName(), s.area(), s.perimeter());
        }
    }
}
