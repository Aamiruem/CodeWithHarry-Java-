import java.util.Scanner;

public class MaxRetriesDemos {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxRetries = 5;
        int retryCount = 0;
        boolean success = false;

        while (retryCount < maxRetries && !success) {
            try {
                System.out.print("Enter a positive integer: ");
                int number = Integer.parseInt(scanner.nextLine());

                if (number <= 0) {
                    throw new IllegalArgumentException("Number must be positive");
                }

                // If input is valid, set success to true and print the number
                success = true;
                System.out.println("You entered: " + number);

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                retryCount++;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                retryCount++;
            }
        }

        try {
            if (retryCount >= maxRetries) {
                throw new Exception("Max retries exceeded.");
            }
        } catch (Exception e) {
            System.out.println("errors: " + e.getMessage());
        }

        scanner.close();
    }
}