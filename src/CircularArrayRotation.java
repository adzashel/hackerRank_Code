import java.util.ArrayList;
import java.util.List;

public class CircularArrayRotation {
   public static  void main(String[] args) {
       int[] arr = {1, 2, 3 , 4 ,5 ,6};
       int k = 3;
       int[] queries = {1 , 2};

       System.out.println(FindCircularRotation(arr , k , queries));
   }

    public static List<Integer> FindCircularRotation(int[] arr , int rotation , int[] query) {
        int n = arr.length;

        int effectiveRotation = rotation % n;
        // create new List
        List<Integer> result = new ArrayList<>();

        for(int queryIndex : query) {
            int originalIndex = (queryIndex - effectiveRotation + n) % n;
            // push the index to the list
            result.add(arr[originalIndex]);
        }

        return  result;
    }
}
