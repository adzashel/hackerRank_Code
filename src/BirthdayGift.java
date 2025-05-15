public class BirthdayGift {
    public static  void main(String[] args) {
        int[] c = { 2  , 2 , 1 , 3 , 2};
        int month = 2;
        int day = 4;

        int result = Gift(day , month , c);
        System.out.println(result);
    }

    public static int Gift(int d , int m , int[] c) {
        int segments = 0 , mSum = 0;

        // loop through the array to find how many ways the chocolate can be divided
        for(int i = 0; i < c.length; i++) {
            if(i < m) {
                mSum += c[i];
            }else{
                mSum = mSum - c[i - m] + c[i];
            }

            if(i >= m - 1 && mSum == d) {
                segments++;
            }
        }
        return segments;
    }
}
