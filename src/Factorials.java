import java.math.BigInteger;

public class Factorials {
    public static void main(String[] args ) {
        int k = 5;
         LongFactorials(k);
    }

    public static void LongFactorials(int a) {
        BigInteger result = BigInteger.ONE; // initialize big integer with value 1;
        int i = 1;
        while(i <= a) {
            result = result.multiply(BigInteger.valueOf(i));
            i++;
        }

        System.out.println(result);
    }
}
