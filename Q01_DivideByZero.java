import java.util.Scanner;

public class Q01_DivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int num = sc.nextInt();
            System.out.print("Enter denominator: ");
            int den = sc.nextInt();
            
            int result = num / den;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Cannot divide by zero! " + e);
        } finally {
            System.out.println("Finally block executed: Cleaning up resources.");
            sc.close();
        }
    }
}
