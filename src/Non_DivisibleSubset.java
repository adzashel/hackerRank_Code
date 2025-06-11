
import java.util.Arrays;

public class Non_DivisibleSubset {
    public  static void main(String[] args) {
        int[] arr = { 1 ,7 , 2 ,4};
        int k = 3;

        System.out.println(nonDivisibleSubsets(k , arr));

    }

    public static int nonDivisibleSubsets(int divisor , int[] arr) {
        int[] remainderCount = new int[divisor];
        Arrays.fill(remainderCount , 0);

        for(int num : arr) {
            remainderCount[num % divisor]++;
        }

        int subsetSize =0;
        if(remainderCount[0] > 0) {
            subsetSize++;
        }

        for(int i =1 ; i <= divisor - i; i++) {
            if(i != divisor - 1) {
                subsetSize += Math.max(remainderCount[i] , remainderCount[divisor  - i]);
            }else {
                if(remainderCount[i] >0) {
                    subsetSize++;
                }
            }
        }
    return subsetSize;
    }
}
