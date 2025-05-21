public class PickingNumber {
    public static void main(String[] args) {
        // Constraints usually state that array elements are between 0 and 99 (inclusive) or 1 and 100.
        // Let's assume values are between 0 and 99 as a common constraint.
        // If values can be up to 100, array size should be 101.
        int[] arr = { 1, 1 , 1 , 2, 2, 4 , 4 , 5, 5, 5};
        int[] frequency = new int[101];
        for(int number : arr) {
            frequency[number]++;
        }
        int maxValue = 0;
// Iterate through the frequency array to find the maximum sum of adjacent frequencies
        // We only need to check up to index 99 because we check frequency[i] + frequency[i+1]
        for(int i =0; i <= 99; i++) {
            maxValue = Math.max(maxValue, frequency[i] + frequency[i + 1] );
        }

        System.out.println(maxValue);
    }
}
