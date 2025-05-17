public class LeapYear {
    public static  void main (String[] args) {
        int year = 2005;

        String result = leap(year);
        System.out.println(result);
    }

    public static String leap(int year) {

        if(year == 1918) return "26.09.1918";

        if((year <= 1917) && (year % 4 == 0)) {
            // julian calendar
            return  "12.09." + year;
        }else if(year > 1918 && year % 400 == 0 || ( year % 4 == 0 ) && (year % 100 != 0) ){
            return "12.09." + year;
        }
        else {
            return "13.09." + year;
        }
    }
}
