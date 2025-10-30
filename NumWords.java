public class NumWords {
    public static void main(String[] args) {
        // Check if user provided one argument
        if (args.length != 1) {
            System.out.println("Usage: java NumWords <number>");
            return;
        }

        // Read input
        int number = Integer.parseInt(args[0]);

        // Separate into hundreds, tens, and ones
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;

        // Print the result
        System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
    }
}