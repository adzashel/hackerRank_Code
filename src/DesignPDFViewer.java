public class DesignPDFViewer {
    public static void main(String[] args) {
        int[] h = {1 , 3 ,1 ,3 ,1 ,4 ,1, 3, 2 ,5 ,5 ,5 ,5 , 5,5 ,5,5, 5 ,5 ,5 ,5, 5, 5 ,5, 5};
        String word = "jieyra";

        System.out.println(FindArea(h , word));
    }


    public static int FindArea(int[] alpha , String word) {
        int heighest = 0;

        for(char c : word.toCharArray()) {
            int charIndex = c - 'a';
            int current = alpha[charIndex];

            if(current > heighest) {
                heighest = current;
            }
        }

        int width = word.length();

        return width * heighest;
    }
}
