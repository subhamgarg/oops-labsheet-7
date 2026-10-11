public class Q07_ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            System.out.println("Worker thread performing intensive database initialization...");
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            System.out.println("Worker thread finished computing assets!");
        });

        worker.start();
        System.out.println("Main thread waiting for worker thread to complete via join()...");
        worker.join(); // Forces main to pause execution until worker terminates
        System.out.println("Worker thread joined! Resuming main operations smoothly.");
    }
}
