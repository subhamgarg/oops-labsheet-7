import java.util.Scanner;

public class Q03_MultipleCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first number (as string): ");
            String str1 = sc.next();
            System.out.print("Enter second number (as string): ");
            String str2 = sc.next();
            
            int num1 = Integer.parseInt(str1);
            int num2 = Integer.parseInt(str2);
            
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Catch Block 1: Please enter valid integers. " + e);
        } catch (ArithmeticException e) {
            System.out.println("Catch Block 2: Division by zero error. " + e);
        } finally {
            sc.close();
        }
    }
}
