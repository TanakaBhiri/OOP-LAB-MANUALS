import java.util.*;

public class Checkout { private DiscountStrategy strategy; Checkout(DiscountStrategy s){strategy=s;} void setStrategy(DiscountStrategy s){strategy=s;} double total(double p){return strategy.apply(p);} }
