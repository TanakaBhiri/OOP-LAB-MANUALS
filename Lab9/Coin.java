import java.util.*;

public enum Coin {
    QUARTER(25),DIME(10),NICKEL(5),PENNY(1);
    final int value;Coin(int value){this.value=value;}
    static Map<Coin,Integer> fewestCoins(int cents){
        if(cents<0)throw new IllegalArgumentException("amount cannot be negative");
        Map<Coin,Integer> result=new LinkedHashMap<>();
        for(Coin c:values()){int count=cents/c.value;if(count>0)result.put(c,count);cents%=c.value;}
        return result;
    }
}
