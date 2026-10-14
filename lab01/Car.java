/**
 * Lab 1, Exercises 1 and 2 (Basic): the Car class.
 *
 * Exercise 1 asks for the fields brand, year and mileage plus a display() method.
 * Exercise 2 adds isAntique(). This file is the finished class for BOTH exercises.
 * Lab 1 comes before constructors, so objects are filled in with the dot operator.
 */
public class Car {

    // EXPLAIN: instance variables define the STATE of every Car object
    String brand;
    int year;
    double mileage;

    // EXPLAIN: an instance method defines BEHAVIOUR; it reads this object's own fields
    void display() {
        System.out.println(brand + ", " + year + ", " + mileage + " km");
    }

    // Exercise 2: true when the car is MORE than 25 years old
    boolean isAntique() {
        int currentYear = java.time.Year.now().getValue();   // so the answer stays correct in future years
        return currentYear - year > 25;
    }
}
