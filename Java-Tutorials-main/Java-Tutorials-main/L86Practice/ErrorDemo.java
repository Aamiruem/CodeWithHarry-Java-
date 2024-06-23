
public class ErrorDemo {
    public static void main(String[] args) {
        // Syntax Error: Uncomment the following line to see a syntax error
        // System.out.println("This is a syntax error" // Missing closing parenthesis
        // and semicolon

        // Logical Error: The intention is to add two numbers, but the logic is
        // incorrect

        int a = 5;
        int b = 10;
        int sum = a - b; // Logical error: should be a + b
        System.out.println("Sum of " + a + " and " + b + " is: " + sum); // Incorrect output

        // Runtime Error: Division by zero
        int divisor = 0;
        try {
            int result = divide(10, divisor);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Runtime Error: " + e.getMessage());
        }
    }

    // Method to demonstrate runtime error
    public static int divide(int numerator, int denominator) {
        return numerator / denominator; // Runtime error if denominator is zero
    }
}
