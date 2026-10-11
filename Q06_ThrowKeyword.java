import java.util.Scanner;

public class Q06_ThrowKeyword {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - Age verification successful.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int userAge = sc.nextInt();
        
        try {
            checkAge(userAge);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception in main: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
