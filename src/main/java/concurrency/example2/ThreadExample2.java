package concurrency.example2;

public class ThreadExample2 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println("NUmber of active threads: " + Thread.activeCount());

        SimpleThread simpleThread;

        for (int counter = 0; counter < 10; counter++) {
            simpleThread = new SimpleThread("T_" + counter); // T_0, T_1...
            simpleThread.start();
        }
    }
}

class SimpleThread extends Thread {

    public SimpleThread(String name) {
        super(name);
    }

    //start() metodas sukuria threada ir iskviecia run() metoda
    @Override
    public void run() {
        System.out.println("Thread: " + getName() + " running");
    }

}
