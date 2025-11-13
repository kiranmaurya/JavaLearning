package CoreJava.Operators;

public class Operators {
        public static void main(String[] args) {

            int a = 10, b = 5;

            // Arithmetic
            System.out.println("Addition: " + (a + b));
            System.out.println("Subtraction: " + (a - b));
            System.out.println("Multiplication: " + (a * b));
            System.out.println("Division: " + (a / b));
            System.out.println("Modulus: " + (a % b));

            // Comparison
            System.out.println("a > b : " + (a > b));
            System.out.println("a == b : " + (a == b));

            // Logical
            boolean x = true, y = false;
            System.out.println("x && y : " + (x && y));  // AND
            System.out.println("x || y : " + (x || y));  // OR
            System.out.println("!x : " + (!x));          // NOT

            // Unary
            int c = 5;
            System.out.println("c before increment: " + c);
            c++;
            System.out.println("c after increment: " + c);

            // Ternary
            int max = (a > b) ? a : b;
            System.out.println("Greater number is: " + max);
        }

}
