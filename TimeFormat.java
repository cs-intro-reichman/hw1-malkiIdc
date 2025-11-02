// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
    public static void main(String[] args) {
        // Parse hours and minutes from the hh:mm string in args[0]
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

        // Decide AM or PM based on the original 24h hour
        String period = (hours < 12) ? "AM" : "PM";

        // Convert hours for 12-hour style:
        // - 00 -> 0
        // - 01..11 -> same
        // - 12 -> 12
        // - 13..23 -> minus 12
        int displayHours = hours;
        if (hours > 12) {
            displayHours = hours - 12;
        }
        // if hours == 0, keep 0
        // if hours == 12, keep 12
        // everything else already fine

        // Ensure minutes always 2 digits (e.g. "03")
        String minuteStr = (minutes < 10) ? "0" + minutes : String.valueOf(minutes);

        // Print final result
        System.out.println(displayHours + ":" + minuteStr + " " + period);
    }
}
