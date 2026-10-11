class UnsafeCounter {
    public int count = 0;
    public void increment() { count++; } // Non-atomic step
}

public class Q08_UnsynchronizedCounter {
    public static void main(String[] args) throws InterruptedException {
        UnsafeCounter counter = new UnsafeCounter();
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start(); t2.start();
        t1.join(); t2.join();

        System.out.println("Expected count: 2000");
        System.out.println("Actual Unsynchronized count outcome: " + counter.count);
    }
}
