class NamedThread extends Thread {
    public NamedThread(String name) { super(name); }
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Running: " + getName());
        }
    }
}

public class Q04_SimultaneousThreads {
    public static void main(String[] args) {
        NamedThread t1 = new NamedThread("Thread-Alpha");
        NamedThread t2 = new NamedThread("Thread-Beta");
        t1.start();
        t2.start();
    }
}
