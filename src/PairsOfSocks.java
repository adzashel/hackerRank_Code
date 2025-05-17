import java.util.HashMap;
import java.util.Map;

public class PairsOfSocks {
    public static void  main(String[] args) {
        int[] socks = { 10 , 10 , 21 , 22 , 10 , 21 , 5  , 4 , 5};

        // create new map object
        Map<Integer , Integer> map = new HashMap<>();
        int pairs = 0; // pairs of socks with the same color

        for ( int s : socks) {
            //get the sum of socks by color , if the value is undefined , it'll be 0
            int sock = map.getOrDefault(s , 0);
            map.put(s, ++sock);
            if(sock % 2 == 0) ++pairs;
        }

        System.out.println(pairs);
    }
}
