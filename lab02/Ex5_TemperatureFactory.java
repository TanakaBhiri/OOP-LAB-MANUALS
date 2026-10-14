class Temperature {
    private final double celsius;

    private Temperature(double celsius) {
        this.celsius = celsius;
    }

    static Temperature fromCelsius(double c) {
        return new Temperature(c);
    }

    static Temperature fromFahrenheit(double f) {
        return new Temperature((f - 32) * 5 / 9);
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

    }
}
