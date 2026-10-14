public class Temperature {
    private final double celsius;
    private Temperature(double celsius) { if(celsius < -273.15) throw new IllegalArgumentException("Below absolute zero"); this.celsius=celsius; }
    static Temperature fromCelsius(double c) { return new Temperature(c); }
    static Temperature fromFahrenheit(double f) { return new Temperature((f-32)*5/9); }
    double getCelsius() { return celsius; }
    double getFahrenheit() { return celsius*9/5+32; }
    public String toString() { return String.format("%.2f C / %.2f F",getCelsius(),getFahrenheit()); }
}
