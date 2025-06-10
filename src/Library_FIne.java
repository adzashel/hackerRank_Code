public class Library_FIne {
    public static void main(String[] args) {
        int d1 = 26 , d2 = 17, m1 = 8,  m2 = 8, y1 = 2025 , y2 = 2025;

        System.out.println(CalculateFine(d1 , d2 , m1 , m2 , y1 , y2));
    }

    public static int CalculateFine(int d1 , int d2 , int m1 , int m2 , int y1 , int y2) {
        if(y1 > y2) return 10000;

        if(y1 == y2 ) {
            if(m1 > m2 ) return (500*(m1 - m2));

            if((m1 == m2 ) && (d1 > d2 )) {
                return (15 * (d1 - d2));
            }

        }
        return 0;
    }
}
