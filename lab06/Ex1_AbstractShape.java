abstract class Shape {

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

class Square extends Rectangle {
    Square(double side) { super(side, side); }
}

public class Ex1_AbstractShape {
    public static void main(String[] args) {

        Shape[] shapes = { new Circle(5), new Rectangle(4, 6), new Square(3) };

        for (Shape s : shapes) {
            System.out.printf("%-10s area = %7.2f  perimeter = %6.2f%n",
                    s.getClass().getSimpleName(), s.area(), s.perimeter());
        }
    }
}
