import java.util.*;

public class Temperature {
    private final double kelvin;
    Temperature(double kelvin) { if(kelvin<0)throw new IllegalArgumentException("Below absolute zero"); this.kelvin=kelvin; }
    double getCelsius(){return kelvin-273.15;}
    double getFahrenheit(){return getCelsius()*9/5+32;}
}
