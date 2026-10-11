import java.util.Scanner;

public class Q02_ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter an index to look up (0 to 4): ");
            int index = sc.nextInt();
            System.out.println("Value at index " + index + " is: " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Invalid index specified! " + e);
        } finally {
            sc.close();
        }
    }
}
