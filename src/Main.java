public class Main  {
    public  static  void main(String[] args) {
        int[] arr = {1,1,0,-1,-1};
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for(int i : arr) {
            if(i < 0) {
                negative++;
            } else if (i > 0) {
                positive++;
            }else {
                zero++;
            }
        }
        int n = arr.length;
        double positiveRatio = (double) positive / n;
        double negativeRatio = (double) negative / n;
        double zeroRatio = (double) zero / n;
        System.out.println(positiveRatio);
        System.out.println(negativeRatio);
        System.out.println(zeroRatio);
    }
}