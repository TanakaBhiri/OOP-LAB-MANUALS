/**
 * Lab 3, Exercise 5 (Challenge): a Temperature that stores KELVIN internally but offers
 * getCelsius() and getFahrenheit(). Values below absolute zero are rejected.
 */
class Temperature {
    private final double kelvin;        // the hidden internal representation

    private Temperature(double kelvin) {
        // Class invariant: a Temperature can never exist below absolute zero (0 K)
        if (kelvin < 0) {
            throw new IllegalArgumentException(String.format("Below absolute zero: %.2f K", kelvin));
        }
        this.kelvin = kelvin;
    }

    static Temperature ofCelsius(double c)    { return new Temperature(c + 273.15); }
    static Temperature ofKelvin(double k)     { return new Temperature(k); }

    // Callers only use these two getters, never the field
    double getCelsius()    { return kelvin - 273.15; }
    double getFahrenheit() { return getCelsius() * 9 / 5 + 32; }
}

public class Ex5_KelvinTemperature {
    public static void main(String[] args) {
        Temperature t = Temperature.ofCelsius(25);
        System.out.printf("25 C -> %.2f C, %.2f F%n", t.getCelsius(), t.getFahrenheit());

        try {
            Temperature.ofCelsius(-300);        // colder than absolute zero (-273.15 C)
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected: " + e.getMessage());
        }

        /*
         * WHY CHANGING THE INTERNAL UNIT WOULD NOT BREAK CALLERS:
         * main() only calls ofCelsius(), getCelsius() and getFahrenheit(). If we later stored
         * Celsius or Fahrenheit inside instead of kelvin, only the private field and these few
         * methods would change. No calling code would need editing. That is encapsulation.
         */
    }
}
