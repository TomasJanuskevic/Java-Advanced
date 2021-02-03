package concurrency.example3;

public class StopWatchThread extends Thread {

    private String prefix;

    public StopWatchThread(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public void run() {
        for (int seconds = 0; seconds < 10; seconds++) {
            System.out.println(prefix + " Stop watch: " + seconds);

            try {
                Thread.sleep(1000); //sustabdome threada 1 sekundei
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
