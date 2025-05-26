public class JumpingOnTheClouds {
    public static void main(String[] args) {
        int[] clouds = {0 , 0 , 1, 0};
        int k = 2;

        System.out.println(Jump(clouds , k));

    }

    public static int Jump(int[] clouds , int jump) {
        int energy = 100;
        int position = 0;

        do {
            position = ( position + jump) % clouds.length;
            energy -= 1 + clouds[position] * 2;
        } while (position != 0);

        return energy; // return energy remaining
    }
}
