// Splits a restaurant bill evenly among three diners.
public class Bill3 {
    public static void main(String[] args) {
        

        // "Prompt" the user — using args values
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

