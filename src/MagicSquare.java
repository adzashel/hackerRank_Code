public class MagicSquare {

    private static final int[][][] MAGIC_SQUARES = {
            {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
            {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
            {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
            {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
            {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
            {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
            {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
            {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}}
    };



    public static int FindMagicSquare(int[][] s) {
        int minVal  = Integer.MAX_VALUE;
        // loop through array
        for (int[][] magicSquare : MAGIC_SQUARES) {
            int currCost = 0;

            // Calculate the cost to transform 's' into 'magicSquare'
            for (int k = 0; k < 3; k++) {
                for (int j = 0; j < 3; j++) {
                    currCost += Math.abs(s[k][j] - magicSquare[k][j]);
                }
            }
            // update mincost if the currCost is smaller
            minVal = Math.min(minVal, currCost);
        }
        return  minVal;
    }

    public static void main(String[] args) {
        int[][] s =  {{5, 3, 4}, {1, 5, 8}, {6, 4, 2}};
        int result = FindMagicSquare(s);
        System.out.println(result);
    }
}
