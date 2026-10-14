/**
 * Lab 2, Exercises 1 and 2 (Basic): the Circle class.
 * Exercise 1: a constructor taking a radius and a no-argument constructor (default 1.0).
 * Exercise 2: a static counter of how many circles exist, with a static getter.
 * This file is the finished class for BOTH exercises.
 */
public class Circle {

    // EXPLAIN: static -> ONE copy shared by every Circle object (Exercise 2)
    private static int count = 0;

    private double radius;

    // Constructor taking a radius
    public Circle(double radius) {
        this.radius = radius;     // this.radius = the field, radius = the parameter
        count++;                  // every circle built through any constructor is counted here
    }

    // No-argument constructor: chains to the one above with the default radius
    public Circle() {
        this(1.0);                // EXPLAIN: this(...) must be the first statement; count++ runs once
    }

    public double getRadius() { return radius; }

    public double area() { return Math.PI * radius * radius; }

    // EXPLAIN: static method -> can be called without an object: Circle.getCount()
    public static int getCount() { return count; }
}
