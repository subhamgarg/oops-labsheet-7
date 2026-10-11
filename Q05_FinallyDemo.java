public class Q05_FinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println("File opened successfully.");
            // Simulating an operation that causes an error
            int data = 50 / 0; 
            System.out.println("Data: " + data);
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in catch block.");
        } finally {
            System.out.println("Resource closed (This always prints!).");
        }
    }
}
