public class TimeConvert {
    public static void main(String[] args) {
        String time = "07:05:45PM";

        String convertFormat = convertTime(time);
        System.out.println(convertFormat);

    }

    private static String convertTime(String time) {
        String[] timeArr = time.substring(0 , time.length()-2).split(":");
        String amPm  = time.substring(time.length()-2).toUpperCase();
        int hour = Integer.parseInt(timeArr[0]);
        int minute = Integer.parseInt(timeArr[1]);
        int seconds = Integer.parseInt(timeArr[2]);

        if(amPm.equals("PM") && hour != 12) {
            hour += 12;
        } else if (amPm.equals("AM") && hour == 12) {
            hour = 0;
        }

        return String.format("%02d:%02d:%02d", hour, minute, seconds);
    }
}
