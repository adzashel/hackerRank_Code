
public class CountValley {
    public static void main(String[] args) {
        String paths = "DDUUUUDD";

        int valleys = 0;
        int countUpDown = 0;
        int steps = paths.length();
        char[] ch = paths.toCharArray();
        for(int step = 0; step < steps; step++) {
            if((ch[step]) == 'U'){
                countUpDown += 1;
                if(countUpDown == 0) {
                    valleys++;
                }
            }else {
                countUpDown -= 1;
            }
        }

        System.out.println(valleys);
    }
}