class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return "Radius can not be Negative";
    }

    @Override
    public String getMessage() {
        return "Radius can not be negative";
    }
}

public class ThrowAndThrow {
    public static double area(int r) throws NegativeRadiusException {
        if (r < 0) {
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static int divide(int a, int b) throws ArithmeticException {
        // Made by Aamir
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        // kamran -> uses divide function created by Aamir
        try {
            // int c = divide(6,0);
            // System.out.println(c);

            // Aamir -> uses area function created by Kamran

            double ar = area(6);
            System.out.println(ar);
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
