 class Insertion {
     void InsertionSort(int[] arr) {
         int n = arr.length;
         for (int i = 1; i < n ; i++) {
             int key = arr[i];
             int j = i - 1;

             while(j >= 0 && arr[j] < key) {
                 arr[j + 1] = arr[j];
                 j -= 1;
             }
             arr[ j + 1] = key;
         }
     }

     void PrintArray (int[] arr ) {
         for (int j : arr) {
             System.out.print(j + " " );

         }
     }

     // Driver method
     public static void main(String[] args)
     {
         int[] arr = { 12, 11, 13, 5, 6 };

         Insertion ob = new Insertion();

         ob.InsertionSort(arr);

         ob.PrintArray(arr);
     }
}
