public class Q06_ThreadSleep {
    public static void main(String[] args) {
        Thread lazyThread = new Thread(() -> {
            try {
                System.out.println("Lazy thread going to sleep for 2 seconds...");
                Thread.sleep(2000);
                System.out.println("Lazy thread woke up!");
            } catch (InterruptedException e) { e.printStackTrace(); }
        });

        Thread activeThread = new Thread(() -> {
            for(int i=1; i<=3; i++) {
                System.out.println("Active execution thread processing loop metric: " + i);
            }
        });

        lazyThread.start();
        activeThread.start();
    }
}
