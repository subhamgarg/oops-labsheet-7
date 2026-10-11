public class Q04_NestedTry {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 2; // Change to 0 to trigger outer catch
            int result = a / b;
            System.out.println("Outer Try - Division result: " + result);
            
            try {
                int[] arr = {1, 2, 3};
                System.out.println("Inner Try - Accessing element at index 5: " + arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner Catch: Array index was out of bounds! " + e);
            }
            
        } catch (ArithmeticException e) {
            System.out.println("Outer Catch: Arithmetic error occurred! " + e);
        }
    }
}
