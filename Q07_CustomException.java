import java.util.Scanner;

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class Q07_CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Create a password (min 6 characters): ");
        String password = sc.nextLine();
        
        try {
            if (password.length() < 6) {
                throw new InvalidPasswordException("Password is too short! It must contain at least 6 characters.");
            }
            System.out.println("Password successfully set!");
        } catch (InvalidPasswordException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
