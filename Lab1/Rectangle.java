import java.time.Year;

public class Rectangle {
    double width, height;
    Rectangle(double width, double height) { this.width=width; this.height=height; }
    double area() { return width*height; }
    double perimeter() { return 2*(width+height); }
    public String toString() { return String.format("Rectangle(%.1f x %.1f, area=%.1f, perimeter=%.1f)", width,height,area(),perimeter()); }
}
