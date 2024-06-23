import java.util.Scanner;

public class MaxRetriesExceededExceptions extends Exception {
    public MaxRetriesExceededExceptions(String message) {
        super(message);
    }

    public static void main(String[] args) {
        try {
            int result = getInputWithRetries(5);
            System.out.println("You entered: " + result);
        } catch (MaxRetriesExceededExceptions e) {
            System.out.println("errors: " + e.getMessage());
        }
    }

    @SuppressWarnings("resource")
    public static int getInputWithRetries(int maxRetries) throws MaxRetriesExceededExceptions {
        Scanner scanner = new Scanner(System.in);
        int retryCount = 0;
        boolean success = false;
        int number = 0;

        while (retryCount < maxRetries && !success) {
            try {
                System.out.print("Enter a positive integer: ");
                number = Integer.parseInt(scanner.nextLine());

                if (number <= 0) {
                    throw new IllegalArgumentException("Number must be positive");
                }

                // If input is valid, set success to true
                success = true;

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                retryCount++;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                retryCount++;
            }
        }

        if (!success) {
            throw new MaxRetriesExceededExceptions("Maximum retries exceeded.");
        }

        scanner.close();
        return number;
    }
}
