public class ExceptionDemo {
    public static void main(String[] args) {
        // Test ArithmeticException
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("HaHa");
        }

        // Test IllegalArgumentException
        try {
            int number = parsePositiveInt("-5");
            System.out.println("Parsed number: " + number);
        } catch (IllegalArgumentException e) {
            System.out.println("HeHe");
        }
    }

    // Method to demonstrate ArithmeticException
    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }

    // Method to demonstrate IllegalArgumentException
    public static int parsePositiveInt(String str) {
        int number = Integer.parseInt(str);
        if (number < 0) {
            throw new IllegalArgumentException("Number must be positive");
        }
        return number;
    }
}
