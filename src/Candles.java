public class Candles {
    public static  void main(String[] args) {
        int[] candles = { 1 , 3 , 4, 4 ,4 ,1};
        int tallestCandles = 0;
        int maxValue = candles[0];

        // find the maximum element
        for(int i = 1; i < candles.length; i++) {
            if(candles[i] > maxValue) {
                maxValue = candles[i];
            }
        }

        // count how many candles are the highest
        for(int i : candles) {
            if(i == maxValue) {
                tallestCandles++;
            }
        }

        System.out.println(tallestCandles);
    }
}
