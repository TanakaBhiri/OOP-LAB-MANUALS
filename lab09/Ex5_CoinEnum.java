import java.util.LinkedHashMap;
import java.util.Map;

enum Coin {
    PENNY(1), NICKEL(5), DIME(10), QUARTER(25);

    private final int value;
    Coin(int value) { this.value = value; }
    int value() { return value; }

    static Map<Coin, Integer> change(int amount) {
        Map<Coin, Integer> result = new LinkedHashMap<>();
        Coin[] coins = values();
        for (int i = coins.length - 1; i >= 0; i--) {
            int count = amount / coins[i].value;
            if (count > 0) {
                result.put(coins[i], count);
                amount = amount % coins[i].value;
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
