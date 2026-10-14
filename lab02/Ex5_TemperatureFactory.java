/**
 * Lab 2, Exercise 5 (Challenge): Temperature with static factory methods and a private constructor.
 *
 * WHY static factories can be clearer than overloaded constructors:
 *  - They have NAMES. fromCelsius(25) and fromFahrenheit(77) say what the number means.
 *  - Two constructors Temperature(double) for Celsius and Fahrenheit are impossible, because
 *    they would have the same signature.
 *  - A factory can validate, reuse existing objects or return a subtype, and a constructor cannot.
 */
class Temperature {
    private final double celsius;          // stored in one unit internally

    // EXPLAIN: private constructor -> outside code MUST use a factory method
    private Temperature(double celsius) {
        this.celsius = celsius;
    }

    static Temperature fromCelsius(double c) {
        return new Temperature(c);
    }

    static Temperature fromFahrenheit(double f) {
        return new Temperature((f - 32) * 5 / 9);       // convert, then store as Celsius
    }

    double getCelsius()    { return celsius; }
    double getFahrenheit() { return celsius * 9 / 5 + 32; }
}

public class Ex5_TemperatureFactory {
    public static void main(String[] args) {
        Temperature a = Temperature.fromCelsius(25);
        Temperature b = Temperature.fromFahrenheit(98.6);

        System.out.printf("25 C   = %.1f F%n", a.getFahrenheit());
        System.out.printf("98.6 F = %.1f C%n", b.getCelsius());
        // Temperature t = new Temperature(5);   // COMPILE ERROR: the constructor is private
    }
}
