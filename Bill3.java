// Splits a restaurant bill evenly among three diners.
public class Bill3 {
    public static void main(String[] args) {
        // Check that we have exactly 4 arguments
        if (args.length != 4) {
            System.out.println("Please run the program like this:");
            System.out.println("java Bill3 <name1> <name2> <name3> <amount>");
            System.out.println("Example: java Bill3 Ron Lisa Dan 100");
            return;
        }

        // "Prompt" the user — using args values
        System.out.println("Reading names and amount from command-line arguments...");
        System.out.println("Name 1: " + args[0]);
        System.out.println("Name 2: " + args[1]);
        System.out.println("Name 3: " + args[2]);
        System.out.println("Total amount: " + args[3] + " Shekels");

        // Extract arguments
        String name1 = args[0];
        String name2 = args[1];
        String name3 = args[2];
        int total = Integer.parseInt(args[3]);

        // Calculate and round up
        double payEach = Math.ceil(total / 3.0);

        // Output message in reverse order
        System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 +
                           ": pay " + payEach + " Shekels each.");
    }
}

