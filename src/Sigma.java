public class Sigma {
    public static void main(String[] args) {
        int threshold = 5;
        int n = 1;
        int result = 0;
        int total = 0;

        while(n <= threshold) {
            result = n * n;
            total += result;
            n++;
        }

        System.out.print(total);
    }
}
