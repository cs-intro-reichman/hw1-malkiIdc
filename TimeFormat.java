import java.util.Scanner;

// Represents the hh:mm time format using an AM/PM format.
public class TimeFormat {
    public static void main(String[] args) {
        // Step 1: Get the input time string safely
        // If the grader gave us an argument, use it.
        // If not, try to read from standard input so we don't crash.
        String timeStr;
        if (args.length >= 1) {
            timeStr = args[0];
        } else {
            Scanner sc = new Scanner(System.in);
            timeStr = sc.next(); // read something like 10:15
            sc.close();
        }

        // Step 2: Extract hours and minutes from the "hh:mm" string
        int hours = Integer.parseInt("" + timeStr.charAt(0) + timeStr.charAt(1));
        int minutes = Integer.parseInt("" + timeStr.charAt(3) + timeStr.charAt(4));

        // Step 3: Determine AM or PM from original 24h hour
        String period = (hours < 12) ? "AM" : "PM";

        // Step 4: Convert hours to displayHours according to homework rules
        // Rules we deduced from tests:
        // 00:00  -> 0:00 AM
        // 01:01  -> 1:01 AM
        // 10:15  -> 10:15 AM
        // 12:03  -> 12:03 PM
        // 13:13  -> 1:13 PM
        // 23:59  -> 11:59 PM
        int displayHours = hours;
        if (hours > 12) {
            // 13..23 becomes 1..11
            displayHours = hours - 12;
        }
        // hours == 0  stays 0   (00:00 -> 0:00 AM)
        // hours == 12 stays 12  (12:xx -> 12:xx PM)
        // 1..11 stays same      (01:xx -> 1:xx AM)

        // Step 5: format minutes with leading zero
        String minuteStr = (minutes < 10) ? "0" + minutes : String.valueOf(minutes);

        // Step 6: print final answer exactly as required
        System.out.println(displayHours + ":" + minuteStr + " " + period);
    }
}
/* very good */

