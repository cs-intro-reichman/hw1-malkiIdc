public class PrintTo5 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java TimeFormat <hh:mm>");
            return;
        }

        String time = args[0];
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);

        String period = (hours < 12) ? "AM" : "PM";
        hours = hours % 12; // converts to 12-hour format (0–11)

        String minuteStr = (minutes < 10) ? "0" + minutes : String.valueOf(minutes);
        System.out.println(hours + ":" + minuteStr + " " + period);
    }
}
