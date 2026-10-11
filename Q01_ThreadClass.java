class MessageThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Message display counter: " + i);
        }
    }
}

public class Q01_ThreadClass {
    public static void main(String[] args) {
        MessageThread t = new MessageThread();
        t.start();
    }
}
