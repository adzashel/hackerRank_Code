import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Permutation {
    public static void main(String[] args) {
        int[] p = { 5 , 2 ,1 , 3 , 4};

        System.out.println(PermutationEquation(p));

    }

    public static List<Integer> PermutationEquation(int[] ar) {
        // create new empty array
        List<Integer> x = new ArrayList<>();
        // create hashMap to map the element of ar;
        Map<Integer , Integer> map = new HashMap<>();

        for(int i = 1 ; i <= ar.length; i++) {
            map.put(ar[i - 1] , i);
        }


        for(int i= 1; i <= ar.length; i++) {
            x.add(map.get(map.get(i)));
        }

        return  x;
    }
}
