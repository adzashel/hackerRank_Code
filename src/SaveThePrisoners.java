public class SaveThePrisoners {
    public static void main(String[] args ) {
        int prisoners = 10;
        int starting = 2;
        int candy = 5;
        System.out.println(
                warnInmate(prisoners , starting , candy));

    }

    public static int warnInmate(int inmate , int starting  , int candy) {
      int   warnPrisoner = (candy+( starting - 1)) % inmate;
        if(warnPrisoner == 0) warnPrisoner = inmate;

        return  warnPrisoner;
    }
}
