public class SplitBill {
    public static void main(String[] args) {
        // prices the foods
        int[] foods = { 10 , 20 , 30 }; // array of foods price
        int b = 25;
        int k = 1;

        CalculateCharge(b , k ,foods);
    }


    public  static void CalculateCharge(int b , int k , int[] foods) {
        int sum = 0; // we assume this is a basket of the foods
        int j = 0; // the sequence of the foods in the array

        // A loop to identify foods that I haven't eaten.
        for(int i : foods) {
            if(j != k) sum += i;
            j++;
        }

        int charge = b - ( sum / 2); // calculate the difference amount i pay with total cost;
        if(charge > 0) {
            System.out.println(charge);
        }else  {
            System.out.println("Bon Appetite");
        }
    }
}
