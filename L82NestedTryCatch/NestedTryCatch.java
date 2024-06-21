import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        int[] marks = {50, 60, 70};
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            try {
                System.out.println("Enter the value of index");
                int idx = sc.nextInt();

                try {
                    System.out.println("Welcome to the video no. 82");
                    try {
                        System.out.println(marks[idx]);
                        flag = false; // Exit the loop as we have successfully printed the mark
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Sorry, this index does not exist.");
                        System.out.println("Exception in level 2");
                    }
                } catch (Exception e) {
                    System.out.println("Exception in level 1");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next(); // Clear the invalid input from the scanner
            }
        }

        System.out.println("Thanks for using this program");
        sc.close();
    }
}
