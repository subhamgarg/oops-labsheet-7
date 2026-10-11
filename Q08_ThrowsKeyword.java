import java.util.Scanner;

public class Q08_ThrowsKeyword {
    // Declaring exception using throws
    public static int readAndConvert() throws NumberFormatException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        String input = sc.next();
        return Integer.parseInt(input);
    }

    public static void main(String[] args) {
        try {
            int val = readAndConvert();
            System.out.println("Successfully converted value: " + val);
        } catch (NumberFormatException e) {
            System.out.println("Caught in main method: Invalid format entered! " + e);
        }
    }
}
