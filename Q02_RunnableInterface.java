class NumberRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

public class Q02_RunnableInterface {
    public static void main(String[] args) {
        Thread t = new Thread(new NumberRunnable());
        t.start();
    }
}
