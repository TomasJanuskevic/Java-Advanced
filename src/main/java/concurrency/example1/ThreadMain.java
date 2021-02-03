package concurrency.example1;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread starts");
        Thread.sleep(5000);
        System.out.println("Main thread still running...");
        Thread.sleep(3000);
        System.out.println("Main thread ends");
    }
}
