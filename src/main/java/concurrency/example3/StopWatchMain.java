package concurrency.example3;

public class StopWatchMain {

    public static void main(String[] args) {
        //atskiras threadas
        StopWatchThread chronometras1 = new StopWatchThread("c1");
        chronometras1.start();

        StopWatchThread chronometras2 = new StopWatchThread("c2");
        chronometras2.start();

        System.out.println("Main thread starts");

        try {
            Thread.sleep(3000);
            System.out.println("Main thread is running again.");
            Thread.sleep(2000);
            System.out.println("Main thread ends.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
