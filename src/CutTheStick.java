import java.util.ArrayList;
import java.util.List;

public class CutTheStick {
    public static void main(String[] args) {
        int[] sticks = {1, 2, 3, 4 , 3, 2, 2, 1};


        System.out.println(CutStick(sticks));
    }

    public static List<Integer> CutStick(int[] sticks) {
        List<Integer> arr = new ArrayList<>();
        int n = arr.size();
        int accumulateCuts = 0, localCuts = 0;

        while (localCuts != n) {
            int localMin = Integer.MAX_VALUE;
            localCuts = 0;

            for(int el : arr) {
                int newVal = el - accumulateCuts;
                if(newVal > 0) {
                    if(newVal < localMin) localMin = newVal;
                } else localCuts++;
            }

            accumulateCuts += localMin;
            if( n - localCuts != 0) arr.add(n - localCuts);
        }

        return arr;
    }
}
