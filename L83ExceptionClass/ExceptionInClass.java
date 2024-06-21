// package L83ExceptionClass;

import java.util.Scanner;

class MyException extends Exception {
    @Override
    public String toString() {
        return "MyException Occurred";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

class MaxAgeException extends Exception {
    @Override
    public String toString() {
        return "Age cannot be greater than 125";
    }

    @Override
    public String getMessage() {
        return "Make sure that the value of age entered is correct";
    }
}

public class ExceptionInClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        
        try {
            if (age > 125) {
                throw new MaxAgeException();
            } else {
                System.out.println("Age is: " + age);
            }
        } catch (MaxAgeException e) {
            System.out.println(e);
        } finally {
            sc.close();
        }
    }
}
