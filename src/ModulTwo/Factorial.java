package ModulTwo;

import java.math.BigInteger;

public class Factorial {
    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.ONE;
        if (value == 1 || value == 0) {
            return result;
        }
        BigInteger number = new BigInteger(String.valueOf(value));
        result = number.multiply(factorial(value - 1));
        return result;
    }
}
