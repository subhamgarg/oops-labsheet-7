public class Q09_FinallyVsReturn {
    public static int testMethod() {
        try {
            System.out.println("Inside try block. Executing return statement...");
            return 100;
        } finally {
            System.out.println("Inside finally block. (Executed AFTER return expression evaluation but BEFORE passing control back!)");
        }
    }

    public static void main(String[] args) {
        int val = testMethod();
        System.out.println("Value returned to main: " + val);
    }
}
