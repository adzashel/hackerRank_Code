import java.util.Arrays;

public class MinAndMaxSum {
    public static  void main(String[] args) {
        int[] arr = { 7 , 69 , 2 ,221 ,8974};
        Arrays.sort(arr);
        long min = 0;
        long max = 0;
        for (int j = 0; j < arr.length - 1; j++) {
            min += j;
        }

        for(int j = 1; j < arr.length; j++) {
            max += arr[j];
        }

    System.out.println(min + " " + max);

    }
}
