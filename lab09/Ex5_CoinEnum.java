import java.util.LinkedHashMap;
import java.util.Map;

/** Lab 9, Exercise 5 (Challenge): enum Coin with values; a method returns the fewest coins for an amount. */
enum Coin {
    PENNY(1), NICKEL(5), DIME(10), QUARTER(25);

    private final int value;                 // enums can hold fields
    Coin(int value) { this.value = value; }  // and a (private) constructor
    int value() { return value; }

    // Greedy: take as many of the LARGEST coin as possible, then move to smaller ones.
    // This gives the fewest coins for this particular set of denominations.
    static Map<Coin, Integer> change(int amount) {
        Map<Coin, Integer> result = new LinkedHashMap<>();
        Coin[] coins = values();
        for (int i = coins.length - 1; i >= 0; i--) {            // largest first
            int count = amount / coins[i].value;
            if (count > 0) {
                result.put(coins[i], count);
                amount = amount % coins[i].value;                // what is left to make
            }
        }
        return result;
    }
}

public class Ex5_CoinEnum {
    public static void main(String[] args) {
        int[] amounts = { 68, 41, 99, 5 };
        for (int amount : amounts) {
            System.out.println(amount + " cents -> " + Coin.change(amount));
        }
    }
}
