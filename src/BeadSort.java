public class BeadSort {
    // method to sort the array or list
    public static void Bead(int[] arr) {
        // find the max value
        int max = arr[0];
        for(int i : arr) {
            if(i > max) {
                max = i;
            }
        }

        // allocating memory
        int[][] beads = new int[arr.length][max];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i]; j++) {
                beads[i][j] = 1;
            }
        }

        // down the beads
        for(int j = 0; j < max; j++) {
            int sum = 0;
            for(int i = 0; i < arr.length;i++) {
                sum += beads[i][j];
                beads[i][j]  = 0;
            }

            for(int z = arr.length - 1; z >= arr.length - sum; z--) {
                arr[z] = j + 1;
            }
        }
   }

    public static void main(String[] args ) {
        int[] randomNum = {7 , 8 , 11 , 2 , 3};
        Bead(randomNum);
        for (int i : randomNum) {
            System.out.print(i + " ");
        }
    }
}
