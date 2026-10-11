class PriorityThread extends Thread {
    public PriorityThread(String name) { super(name); }
    public void run() {
        System.out.println(getName() + " with priority " + getPriority() + " is currently running.");
    }
}

public class Q05_ThreadPriority {
    public static void main(String[] args) {
        PriorityThread low = new PriorityThread("Low-Priority-Thread");
        PriorityThread med = new PriorityThread("Normal-Priority-Thread");
        PriorityThread high = new PriorityThread("High-Priority-Thread");

        low.setPriority(Thread.MIN_PRIORITY);  // 1
        med.setPriority(Thread.NORM_PRIORITY); // 5
        high.setPriority(Thread.MAX_PRIORITY); // 10

        low.start();
        med.start();
        high.start();
    }
}
