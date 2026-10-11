public class Q03_ThreadLifeCycle {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            try {
                // RUNNING State -> entering BLOCKED/WAITING via sleep
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println("State after instantiation: " + t.getState()); // NEW
        t.start();
        System.out.println("State after start(): " + t.getState()); // RUNNABLE
        
        Thread.sleep(100);
        System.out.println("State during sleep(): " + t.getState()); // TIMED_WAITING
        
        t.join();
        System.out.println("State after task completion: " + t.getState()); // TERMINATED
    }
}
