public class SquareNumber {
    public static void main(String[] args ) {
        int a = 3;
        int b = 9;
        int count = 0;

        int num = (int) Math.ceil(Math.sqrt(a));

        while(num*num <= b) {
            count++;
            num++;
        }

        System.out.println(count);
    }
}
