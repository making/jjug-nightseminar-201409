package jjug;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeFactors {

    public static List<BigInteger> divide(BigInteger n) {
        Stats.increment();
        List<BigInteger> result = new ArrayList<>();
        for (BigInteger i = BigInteger.valueOf(2); i.multiply(i).compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
            while (n.mod(i).equals(BigInteger.ZERO)) {
                result.add(i);
                n = n.divide(i);
            }
        }
        if (!n.equals(BigInteger.ONE)) {
            result.add(n);
        }
        Collections.sort(result);
        return result;
    }
}
