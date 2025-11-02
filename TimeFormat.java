// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

        String period = (hours < 12) ? "AM" : "PM";

        // ✅ Fix: convert to 12-hour format properly
        if (hours == 0) {
            hours = 12; // midnight
        } else if (hours > 12) {
            hours -= 12; // 13..23 -> 1..11 PM
        }

        String minuteStr = (minutes < 10) ? "0" + minutes : String.valueOf(minutes);
        System.out.println(hours + ":" + minuteStr + " " + period);
    }
}
