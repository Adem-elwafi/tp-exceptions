package exercice2;

public class SumArguments {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            try {
                // parseInt is a static method of Integer class
                int num = Integer.parseInt(args[i]);
                sum += num;  // Now we can add the converted number
            } catch (NumberFormatException e) {
                System.out.println("Sorry, '" + args[i] + "' is not a valid number");
            }
        }
        System.out.println("Total sum: " + sum);
    }
}