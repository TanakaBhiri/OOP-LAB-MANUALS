import java.time.Year;

public class Car {
    String brand; int year; double mileage;
    Car(String brand, int year, double mileage) { this.brand=brand; this.year=year; this.mileage=mileage; }
    void display() { System.out.printf("%s, %d, %.1f km%n", brand, year, mileage); }
    boolean isAntique() { return Year.now().getValue() - year > 25; }
}
