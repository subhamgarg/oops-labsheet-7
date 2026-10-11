class FileDownloader extends Thread {
    private String filename;
    public FileDownloader(String filename) { this.filename = filename; }
    
    public void run() {
        System.out.println("Started download sequence for: " + filename);
        try {
            Thread.sleep(1500); // Mimicking network latency processing asset
        } catch (InterruptedException e) {}
        System.out.println("Download complete! File saved safely: " + filename);
    }
}

public class Q10_RealLifeMultithreading {
    public static void main(String[] args) {
        FileDownloader d1 = new FileDownloader("Lecture_Video.mp4");
        FileDownloader d2 = new FileDownloader("Dataset_Archive.zip");
        FileDownloader d3 = new FileDownloader("Setup_Installer.exe");

        d1.start();
        d2.start();
        d3.start();
    }
}
