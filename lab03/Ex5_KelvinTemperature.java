class Temperature {
    private final double kelvin;

    private Temperature(double kelvin) {

        if (kelvin < 0) {
            throw new IllegalArgumentException(String.format("Below absolute zero: %.2f K", kelvin));
        }
        this.kelvin = kelvin;
    }

    static Temperature ofCelsius(double c)    { return new Temperature(c + 273.15); }
    static Temperature ofKelvin(double k)     { return new Temperature(k); }

    double getCelsius()    { return kelvin - 273.15; }
    double getFahrenheit() { return getCelsius() * 9 / 5 + 32; }
}

public class Ex5_KelvinTemperature {
    public static void main(String[] args) {
        Temperature t = Temperature.ofCelsius(25);
        System.out.printf("25 C -> %.2f C, %.2f F%n", t.getCelsius(), t.getFahrenheit());

        try {
            Temperature.ofCelsius(-300);
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected: " + e.getMessage());
        }

    }
}
