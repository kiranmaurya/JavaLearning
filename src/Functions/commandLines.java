package Functions;

public class commandLines {

        public static void main(String[] args) {

            // Check if any arguments are passed
            if (args.length == 0) {
                System.out.println("No command line arguments found!");
            } else {
                System.out.println("Command Line Arguments are:");
                for (int i = 0; i < args.length; i++) {
                    System.out.println("Argument " + i + ": " + args[i]);
                }

                // Example: using arguments as numbers
                if (args.length >= 2) {
                    int num1 = Integer.parseInt(args[0]); // convert String → int
                    int num2 = Integer.parseInt(args[1]);
                    System.out.println("Sum of first two arguments: " + (num1 + num2));
                }
            }
        }
}
