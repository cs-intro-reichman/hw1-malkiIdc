public class FVCalc {
    public static void main(String[] args) {
        // Check there are exactly 3 arguments
        if (args.length != 3) {
            System.out.println("Usage: java FVCalc <currentValue> <rate> <years>");
            return;
        }

        // 1. Read inputs
        int currentValue = Integer.parseInt(args[0]);
        double rate = Double.parseDouble(args[1]);
        int years = Integer.parseInt(args[2]);

        // 2. Convert rate to decimal
        rate = rate / 100;

        // 3. Compute future value
        double futureValue = currentValue * Math.pow(1 + rate, years);

        // 4. Print result (future value cast to int)
        System.out.println("After " + years + " years, $" + currentValue + 
                           " saved at " + (rate * 100) + "% will yield $" + (int)futureValue);
    }
}
/* very clean and structured code. Liked the input validation too. nice job */
