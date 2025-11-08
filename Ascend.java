public class Ascend {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Ascend <lim>");
            return;
        }

        int lim = Integer.parseInt(args[0]);

        // Generate 3 random integers in [0, lim)
        int a = (int)(Math.random() * lim);
        int b = (int)(Math.random() * lim);
        int c = (int)(Math.random() * lim);

        // Print the original numbers
        System.out.println(a + " " + b + " " + c);

        // Find min, max, and middle without using if
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int mid = a + b + c - min - max;

        // Print in ascending order
        System.out.println(min + " " + mid + " " + max);
    }
}
/* Nice */

