import java.util.Scanner;

public class SpecificException {
    public static void main(String[] args) {
        int marks[] = new int[3];
        marks[0] = 50;
        marks[1] = 60;
        marks[2] = 70;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Index");
        int idx = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with");
        int num = sc.nextInt();
        try {
            System.out.println("The value at array index entered is: " + marks[idx]);
            System.out.println("The value of array-value/number: " + marks[idx] / num);
        } catch (Exception e) {
            System.out.println("Array Index is out of bounds");
        }
    }
}
