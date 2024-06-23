class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

class CannotDivideByZeroException extends Exception {
    public CannotDivideByZeroException(String message) {
        super(message);
    }
}

class MaxInputException extends Exception {
    public MaxInputException(String message) {
        super(message);
    }
}

class MaxMultiplierReachedException extends Exception {
    public MaxMultiplierReachedException(String message) {
        super(message);
    }
}



public class Calculator {
    public static int add(int a, int b) throws InvalidInputException, MaxInputException {
        validateInputs(a, b);
        return a + b;
    }

    public static int subtract(int a, int b) throws InvalidInputException, MaxInputException {
        validateInputs(a, b);
        return a - b;
    }

    public static int multiply(int a, int b) throws InvalidInputException, MaxInputException, MaxMultiplierReachedException {
        validateInputs(a, b);
        if (a > 7000 || b > 7000) {
            throw new MaxMultiplierReachedException("Max Multiplier Reached Exception - Inputs should not be greater than 7000 for multiplication");
        }
        return a * b;
    }

    public static double divide(int a, int b) throws InvalidInputException, CannotDivideByZeroException, MaxInputException {
        validateInputs(a, b);
        if (b == 0) {
            throw new CannotDivideByZeroException("Cannot divide by 0");
        }
        return (double) a / b;
    }

    private static void validateInputs(int a, int b) throws InvalidInputException, MaxInputException {
        if (!isNumeric(a) || !isNumeric(b)) {
            throw new InvalidInputException("Invalid input Exception - Inputs should be numeric");
        }
        if (a > 100000 || b > 100000) {
            throw new MaxInputException("Max Input Exception - Inputs should not be greater than 100000");
        }
    }

    private static boolean isNumeric(int num) {
        // Assuming the inputs are always integers in this example,
        // this check is redundant but included for completeness.
        return true;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Addition: " + add(50000, 50000));
            System.out.println("Subtraction: " + subtract(100000, 50000));
            System.out.println("Multiplication: " + multiply(7000, 7000));
            System.out.println("Division: " + divide(100000, 2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Invalid Input: " + add(8, '&'));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Divide by Zero: " + divide(100, 0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Max Input: " + add(100001, 1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Max Multiplier: " + multiply(7001, 1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
