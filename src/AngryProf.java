public class AngryProf {
    public static void main(String[] args) {
        int k = 4;
        int[] a = {-1 , 2 , 3 , -3 ,-2 , -10};

        int students = 0;

        for(int std : a) {
            if(std <= 0) {
                students++;
            }
        }

        System.out.println(students >= k ? "YES" : "NO");
    }
}
