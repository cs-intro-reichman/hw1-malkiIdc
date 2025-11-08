import java.util.Scanner;

public class NumWords {
    public static void main(String[] args) {
        // Step 1: Safely read the input number
        // If the grader gives it as a command-line argument, use that.
        // Otherwise=, read it from standard input (Scanner) so we never crash.
        String inputStr;
        if (args.length >= 1) {
            inputStr = args[0];
        } else {
            Scanner sc = new Scanner(System.in);
            inputStr = sc.next(); // read first token like "123"
            sc.close();
        }

        // Step 2: Convert to int
        int n = Integer.parseInt(inputStr); // Convert what to int? Give a more meaningful name next time. inputAsInt for example

        // Step 3: Extract hundreds, tens, ones
        int hundreds = n / 100;
        int tens = (n / 10) % 10;
        int ones = n % 10;

        // Step 4: Print in the exact required format
        System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
    }
}

/* The use of Scanner is advanced and not needed here. I guess that you have coded before, in that case nice */
